from pickle import load

from flask import Flask, request
from waitress import serve

# Create API
app = Flask(__name__)

# Load model
rf = load(open('./classifier.pkl', 'rb'))


# Subdomain_converter
def subdomain_converter(subdomain):
    if subdomain == 'Logistic':
        return 0
    elif subdomain == 'IndustrialProcesses':
        return 1
    elif subdomain in 'SmartHome':
        return 2
    elif subdomain in 'Agriculture':
        return 3
    elif subdomain in 'IndependentLiving':
        return 4
    elif subdomain in 'HealthCare':
        return 5
    elif subdomain in 'Undefined':
        return 6
    elif subdomain in 'SmartGrid':
        return 7
    elif subdomain in 'SecurityPublic':
        return 8
    elif subdomain in 'UrbanMobility':
        return 9
    elif subdomain in 'SmartCampus':
        return 10
    else:
        return -1


# Route
@app.route('/classifier/', methods=['POST'])
def classifier():
    data = subdomain_converter(request.form['data'])

    if data == -1:
        return 'Invalid Subdomain'

    if rf.predict([[data]])[0] == 0:
        return 'Ofuscação'

    elif rf.predict([[data]])[0] == 1:
        return 'Pertubação'

    elif rf.predict([[data]])[0] == 2:
        return 'k-anonimato'

    elif rf.predict([[data]])[0] == 3:
        return 'Generalização de Dados'

    elif rf.predict([[data]])[0] == 4:
        return 'Invalid subdomain'


# Define IP and Port
if __name__ == '__main__':
    serve(app, host="0.0.0.0", port=12345)
