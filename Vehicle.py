import Main
class Vehicle(Locations):
    packages = None
    def __init__(self):
        self.packages = []

    def addPackage(self, p):
        self.packages.append(p)

    def removePackage(self, p):
        self.package.pop(p.getKey())

