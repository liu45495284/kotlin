package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    val `in`: Int = 0

    fun test() {
        testNotRenamed("in", { `in` })
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}