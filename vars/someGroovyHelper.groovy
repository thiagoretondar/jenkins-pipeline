import org.thiagoretondar.HelperTest

def call(someStringParam) {
    echo "CALLING HELPER TEST WITH ${someStringParam}"

    HelperTest helperTest = new HelperTest()
    helperTest.doSomething(someStringParam)
}