package org.thiagoretondar

class HelperTest {

    def doSomething(someParam) {
        this.internalParam = someParam

        return internalParam + " - testing method"
    }
}