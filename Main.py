class Locations:
    x =0
    y = 0
    def __init__(self):
        self
    def getX(self,x):
        return self.x
    def getY(self,y):
        return self.y
    def setX(self,var):
        self.x =var
    def setY(self,var):
        self.y = var
    def getLocation(self):
        return [self.x,self.y]

class Vehicle(Locations):
    packages = None
    def __init__(self):
        self.packages = []

    def addPackage(self, p):
        self.packages.append(p)

    def removePackage(self, p):
        self.package.pop(p.getKey())

class Package(Locations):
    pos = None
    dest = None
    key = None
    def __init__(self, p, d, k):
        self.pos = p
        self.dest = d
        self.key = k

    def getPost(self):
        return self.pos

    def getDest(self):
        return self.dest

    def getKey(self):
        return self.key


class State:
    vehicle = None
    package = None
    carry = False

    def __init__(self,v,p,c):
        self.vehicle = v
        self.package = p
        self.carry = c



    def getVehicle(self):
        return self.vehicle
    def getPackages(self):
        return self.package
    def getCarry(self):
        return self.carry
    def setCarry(self,variable):
        self.carry = variable
    def setPackageLocation(self,var):
        self.package=Locations.setY(var)
    def setVehicleLocation(self,var):
        self.vehicle = Locations.setY(var)

class Problem:
    state








