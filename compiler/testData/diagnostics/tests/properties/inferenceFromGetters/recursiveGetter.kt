// !WITH_NEW_INFERENCE
// !CHECK_TYPE
// NI_EXPECTED_FILE

val x get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>x<!>

class A {
    val y get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>y<!>

    val a get() = <!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>b<!>
    val b get() = <!NI;DEBUG_INFO_MISSING_UNRESOLVED, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>a<!>

    val <!NI;IMPLICIT_NOTHING_PROPERTY_TYPE!>z1<!> get() = <!NI;IMPLICIT_NOTHING_AS_TYPE_PARAMETER, NI;NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>id<!>(<!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>z1<!>)
    val z2 get() = <!NI;IMPLICIT_NOTHING_AS_TYPE_PARAMETER, NI;NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>l<!>(<!NI;DEBUG_INFO_MISSING_UNRESOLVED, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE, TYPECHECKER_HAS_RUN_INTO_RECURSIVE_PROBLEM!>z2<!>)

    val u get() = <!UNRESOLVED_REFERENCE!>field<!>
}

fun <E> id(x: E) = x
fun <E> l(<!UNUSED_PARAMETER!>x<!>: E): List<E> = null!!
