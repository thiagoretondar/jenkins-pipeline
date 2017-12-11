package org.thiagoretondar

class HelperTest {

    def doSomething(someParam) {
        this.internalParam = someParam

        return echo "Hello, ${someStringParam}."
    }
}
