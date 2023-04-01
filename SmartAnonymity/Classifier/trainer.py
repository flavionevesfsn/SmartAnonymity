from numpy import array
from sklearn.ensemble import RandomForestClassifier
from pickle import dump

# Input data
X = [[0], [1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11]]
Y = [0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4]

# Train Classifier
clf = RandomForestClassifier(n_estimators=100)
clf.fit(array(X), array(Y))

# Save Classifier
dump(clf, open('./classifier.pkl', 'wb'))
