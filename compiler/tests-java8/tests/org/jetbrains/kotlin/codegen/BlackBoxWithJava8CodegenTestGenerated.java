/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/java8/box")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BlackBoxWithJava8CodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
        KotlinTestUtils.runTest(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInBox() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("asyncException.kt")
    public void testAsyncException_1_2() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/java8/box/asyncException.kt", "kotlin.coroutines.experimental");
    }

    @TestMetadata("asyncException.kt")
    public void testAsyncException_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/java8/box/asyncException.kt", "kotlin.coroutines");
    }

    @TestMetadata("async.kt")
    public void testAsync_1_2() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/java8/box/async.kt", "kotlin.coroutines.experimental");
    }

    @TestMetadata("async.kt")
    public void testAsync_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/codegen/java8/box/async.kt", "kotlin.coroutines");
    }

    @TestMetadata("capturedSuperCall.kt")
    public void testCapturedSuperCall() throws Exception {
        runTest("compiler/testData/codegen/java8/box/capturedSuperCall.kt");
    }

    @TestMetadata("defaultMethodCallFromInterface.kt")
    public void testDefaultMethodCallFromInterface() throws Exception {
        runTest("compiler/testData/codegen/java8/box/defaultMethodCallFromInterface.kt");
    }

    @TestMetadata("defaultMethodCallViaClass.kt")
    public void testDefaultMethodCallViaClass() throws Exception {
        runTest("compiler/testData/codegen/java8/box/defaultMethodCallViaClass.kt");
    }

    @TestMetadata("defaultMethodCallViaInterface.kt")
    public void testDefaultMethodCallViaInterface() throws Exception {
        runTest("compiler/testData/codegen/java8/box/defaultMethodCallViaInterface.kt");
    }

    @TestMetadata("defaultMethodOverride.kt")
    public void testDefaultMethodOverride() throws Exception {
        runTest("compiler/testData/codegen/java8/box/defaultMethodOverride.kt");
    }

    @TestMetadata("dontDelegateToDefaultMethods.kt")
    public void testDontDelegateToDefaultMethods() throws Exception {
        runTest("compiler/testData/codegen/java8/box/dontDelegateToDefaultMethods.kt");
    }

    @TestMetadata("functionAssertion.kt")
    public void testFunctionAssertion() throws Exception {
        runTest("compiler/testData/codegen/java8/box/functionAssertion.kt");
    }

    @TestMetadata("inheritKotlin.kt")
    public void testInheritKotlin() throws Exception {
        runTest("compiler/testData/codegen/java8/box/inheritKotlin.kt");
    }

    @TestMetadata("invokeDefaultViaSuper.kt")
    public void testInvokeDefaultViaSuper() throws Exception {
        runTest("compiler/testData/codegen/java8/box/invokeDefaultViaSuper.kt");
    }

    @TestMetadata("invokeDefaultViaSuper_16.kt")
    public void testInvokeDefaultViaSuper_16() throws Exception {
        runTest("compiler/testData/codegen/java8/box/invokeDefaultViaSuper_16.kt");
    }

    @TestMetadata("longChainOfKotlinExtendsFromJavaWithDefault.kt")
    public void testLongChainOfKotlinExtendsFromJavaWithDefault() throws Exception {
        runTest("compiler/testData/codegen/java8/box/longChainOfKotlinExtendsFromJavaWithDefault.kt");
    }

    @TestMetadata("removeIf.kt")
    public void testRemoveIf() throws Exception {
        runTest("compiler/testData/codegen/java8/box/removeIf.kt");
    }

    @TestMetadata("samOnInterfaceWithDefaultMethod.kt")
    public void testSamOnInterfaceWithDefaultMethod() throws Exception {
        runTest("compiler/testData/codegen/java8/box/samOnInterfaceWithDefaultMethod.kt");
    }

    @TestMetadata("stream.kt")
    public void testStream() throws Exception {
        runTest("compiler/testData/codegen/java8/box/stream.kt");
    }

    @TestMetadata("streamBackwardCompatibility.kt")
    public void testStreamBackwardCompatibility() throws Exception {
        runTest("compiler/testData/codegen/java8/box/streamBackwardCompatibility.kt");
    }

    @TestMetadata("useStream.kt")
    public void testUseStream() throws Exception {
        runTest("compiler/testData/codegen/java8/box/useStream.kt");
    }

    @TestMetadata("compiler/testData/codegen/java8/box/builtinStubMethods")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class BuiltinStubMethods extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInBuiltinStubMethods() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/builtinStubMethods"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("immutableRemove.kt")
        public void testImmutableRemove() throws Exception {
            runTest("compiler/testData/codegen/java8/box/builtinStubMethods/immutableRemove.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/delegationBy")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DelegationBy extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDelegationBy() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/delegationBy"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("byMiddleInterface.kt")
        public void testByMiddleInterface() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/byMiddleInterface.kt");
        }

        @TestMetadata("defaultOverride.kt")
        public void testDefaultOverride() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/defaultOverride.kt");
        }

        @TestMetadata("delegationToMap.kt")
        public void testDelegationToMap() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/delegationToMap.kt");
        }

        @TestMetadata("diamond.kt")
        public void testDiamond() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/diamond.kt");
        }

        @TestMetadata("diamond2.kt")
        public void testDiamond2() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/diamond2.kt");
        }

        @TestMetadata("inClassDeclaration.kt")
        public void testInClassDeclaration() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/inClassDeclaration.kt");
        }

        @TestMetadata("mixed.kt")
        public void testMixed() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/mixed.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/simple.kt");
        }

        @TestMetadata("simple1.0.kt")
        public void testSimple1_0() throws Exception {
            runTest("compiler/testData/codegen/java8/box/delegationBy/simple1.0.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/jvm8")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm8 extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJvm8() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("bridgeInClass.kt")
        public void testBridgeInClass() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/bridgeInClass.kt");
        }

        @TestMetadata("bridgeInInterface.kt")
        public void testBridgeInInterface() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/bridgeInInterface.kt");
        }

        @TestMetadata("capturedSuperCall.kt")
        public void testCapturedSuperCall() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/capturedSuperCall.kt");
        }

        @TestMetadata("defaultArgs.kt")
        public void testDefaultArgs() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/defaultArgs.kt");
        }

        @TestMetadata("inlineFromAnotherFile.kt")
        public void testInlineFromAnotherFile() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/inlineFromAnotherFile.kt");
        }

        @TestMetadata("inlineFromStdlib.kt")
        public void testInlineFromStdlib() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/inlineFromStdlib.kt");
        }

        @TestMetadata("kt11969.kt")
        public void testKt11969() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt11969.kt");
        }

        @TestMetadata("kt14243.kt")
        public void testKt14243() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt14243.kt");
        }

        @TestMetadata("kt14243_2.kt")
        public void testKt14243_2() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt14243_2.kt");
        }

        @TestMetadata("kt14243_prop.kt")
        public void testKt14243_prop() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt14243_prop.kt");
        }

        @TestMetadata("kt16581.kt")
        public void testKt16581() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt16581.kt");
        }

        @TestMetadata("kt16581_2.kt")
        public void testKt16581_2() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt16581_2.kt");
        }

        @TestMetadata("kt16588.kt")
        public void testKt16588() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt16588.kt");
        }

        @TestMetadata("kt6301.kt")
        public void testKt6301() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt6301.kt");
        }

        @TestMetadata("kt6301_2.kt")
        public void testKt6301_2() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/kt6301_2.kt");
        }

        @TestMetadata("oneImplementation.kt")
        public void testOneImplementation() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/oneImplementation.kt");
        }

        @TestMetadata("oneImplementation2.kt")
        public void testOneImplementation2() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/oneImplementation2.kt");
        }

        @TestMetadata("simpleCall.kt")
        public void testSimpleCall() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/simpleCall.kt");
        }

        @TestMetadata("simpleProperty.kt")
        public void testSimpleProperty() throws Exception {
            runTest("compiler/testData/codegen/java8/box/jvm8/simpleProperty.kt");
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Defaults extends AbstractBlackBoxCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            @TestMetadata("accessor.kt")
            public void testAccessor() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessor.kt");
            }

            @TestMetadata("accessorFromCompanion.kt")
            public void testAccessorFromCompanion() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessorFromCompanion.kt");
            }

            @TestMetadata("accessorsFromDefaultImpls.kt")
            public void testAccessorsFromDefaultImpls() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/accessorsFromDefaultImpls.kt");
            }

            public void testAllFilesPresentInDefaults() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("bridgeInClass.kt")
            public void testBridgeInClass() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInClass.kt");
            }

            @TestMetadata("bridgeInInterface.kt")
            public void testBridgeInInterface() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterface.kt");
            }

            @TestMetadata("bridgeInInterface2.kt")
            public void testBridgeInInterface2() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterface2.kt");
            }

            @TestMetadata("bridgeInInterfaceWithProperties.kt")
            public void testBridgeInInterfaceWithProperties() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterfaceWithProperties.kt");
            }

            @TestMetadata("bridgeInInterfaceWithProperties2.kt")
            public void testBridgeInInterfaceWithProperties2() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterfaceWithProperties2.kt");
            }

            @TestMetadata("bridgeWithJava.kt")
            public void testBridgeWithJava() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeWithJava.kt");
            }

            @TestMetadata("callableReference.kt")
            public void testCallableReference() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/callableReference.kt");
            }

            @TestMetadata("capturedSuperCall.kt")
            public void testCapturedSuperCall() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/capturedSuperCall.kt");
            }

            @TestMetadata("defaultArgs.kt")
            public void testDefaultArgs() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/defaultArgs.kt");
            }

            @TestMetadata("diamond.kt")
            public void testDiamond() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/diamond.kt");
            }

            @TestMetadata("inline.kt")
            public void testInline() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/inline.kt");
            }

            @TestMetadata("inlineProperty.kt")
            public void testInlineProperty() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/inlineProperty.kt");
            }

            @TestMetadata("kt11969.kt")
            public void testKt11969() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt11969.kt");
            }

            @TestMetadata("kt14243.kt")
            public void testKt14243() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243.kt");
            }

            @TestMetadata("kt14243_2.kt")
            public void testKt14243_2() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_2.kt");
            }

            @TestMetadata("kt14243_prop.kt")
            public void testKt14243_prop() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_prop.kt");
            }

            @TestMetadata("oneImplementation.kt")
            public void testOneImplementation() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation.kt");
            }

            @TestMetadata("oneImplementation2.kt")
            public void testOneImplementation2() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation2.kt");
            }

            @TestMetadata("privateDefaultFromDefaultImpl.kt")
            public void testPrivateDefaultFromDefaultImpl() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/privateDefaultFromDefaultImpl.kt");
            }

            @TestMetadata("privateInDefaultImpls.kt")
            public void testPrivateInDefaultImpls() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/privateInDefaultImpls.kt");
            }

            @TestMetadata("simpleCall.kt")
            public void testSimpleCall() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/simpleCall.kt");
            }

            @TestMetadata("simpleProperty.kt")
            public void testSimpleProperty() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/simpleProperty.kt");
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/defaults/superCall.kt");
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Compatibility extends AbstractBlackBoxCodegenTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
                }

                public void testAllFilesPresentInCompatibility() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("bridge.kt")
                public void testBridge() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridge.kt");
                }

                @TestMetadata("bridge2.kt")
                public void testBridge2() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridge2.kt");
                }

                @TestMetadata("bridge3.kt")
                public void testBridge3() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridge3.kt");
                }

                @TestMetadata("bridgeWithProperties.kt")
                public void testBridgeWithProperties() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridgeWithProperties.kt");
                }

                @TestMetadata("bridgeWithProperties2.kt")
                public void testBridgeWithProperties2() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridgeWithProperties2.kt");
                }

                @TestMetadata("bridgeWithProperties3.kt")
                public void testBridgeWithProperties3() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/bridgeWithProperties3.kt");
                }

                @TestMetadata("defaultArgs.kt")
                public void testDefaultArgs() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/defaultArgs.kt");
                }

                @TestMetadata("inheritedJvmDefault.kt")
                public void testInheritedJvmDefault() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/inheritedJvmDefault.kt");
                }

                @TestMetadata("propertyAnnotation.kt")
                public void testPropertyAnnotation() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/propertyAnnotation.kt");
                }

                @TestMetadata("simpleFunction.kt")
                public void testSimpleFunction() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/compatibility/simpleFunction.kt");
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class DelegationBy extends AbstractBlackBoxCodegenTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
                }

                public void testAllFilesPresentInDelegationBy() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("simple.kt")
                public void testSimple() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy/simple.kt");
                }

                @TestMetadata("simpleProperty.kt")
                public void testSimpleProperty() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/delegationBy/simpleProperty.kt");
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class NoDelegation extends AbstractBlackBoxCodegenTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
                }

                public void testAllFilesPresentInNoDelegation() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("noDelegationToDefaultMethodInClass.kt")
                public void testNoDelegationToDefaultMethodInClass() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInClass.kt");
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface.kt")
                public void testNoDelegationToDefaultMethodInInterface() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface.kt");
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface2.kt")
                public void testNoDelegationToDefaultMethodInInterface2() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface2.kt");
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/reflection")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Reflection extends AbstractBlackBoxCodegenTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
                }

                public void testAllFilesPresentInReflection() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("propertyAnnotations.kt")
                public void testPropertyAnnotations() throws Exception {
                    runTest("compiler/testData/codegen/java8/box/jvm8/defaults/reflection/propertyAnnotations.kt");
                }
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/interfaceFlag")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InterfaceFlag extends AbstractBlackBoxCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInInterfaceFlag() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/interfaceFlag"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCall.kt");
            }

            @TestMetadata("superCallIndirect.kt")
            public void testSuperCallIndirect() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCallIndirect.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/optimizations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Optimizations extends AbstractBlackBoxCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInOptimizations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/optimizations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("hashCode.kt")
            public void testHashCode() throws Exception {
                runTest("compiler/testData/codegen/java8/box/jvm8/optimizations/hashCode.kt");
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapGetOrDefault extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMapGetOrDefault() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapGetOrDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noTypeSafeBridge.kt")
        public void testNoTypeSafeBridge() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/noTypeSafeBridge.kt");
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridge.kt");
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridgeNotNullAny.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapRemove")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapRemove extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInMapRemove() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapRemove"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noDefaultImpls.kt")
        public void testNoDefaultImpls() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapRemove/noDefaultImpls.kt");
        }

        @TestMetadata("readOnlyMap.kt")
        public void testReadOnlyMap() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapRemove/readOnlyMap.kt");
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridge.kt");
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            runTest("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridgeNotNullAny.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/parametersMetadata")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParametersMetadata extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInParametersMetadata() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/parametersMetadata"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultImpls.kt")
        public void testDefaultImpls() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/defaultImpls.kt");
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/enum.kt");
        }

        @TestMetadata("extensionFunction.kt")
        public void testExtensionFunction() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/extensionFunction.kt");
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/function.kt");
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/innerClass.kt");
        }

        @TestMetadata("superParams.kt")
        public void testSuperParams() throws Exception {
            runTest("compiler/testData/codegen/java8/box/parametersMetadata/superParams.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/reflection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Reflection extends AbstractBlackBoxCodegenTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInReflection() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("realParameterNames.kt")
        public void testRealParameterNames() throws Exception {
            runTest("compiler/testData/codegen/java8/box/reflection/realParameterNames.kt");
        }

        @TestMetadata("synthesizedParameterNames.kt")
        public void testSynthesizedParameterNames() throws Exception {
            runTest("compiler/testData/codegen/java8/box/reflection/synthesizedParameterNames.kt");
        }

        @TestMetadata("compiler/testData/codegen/java8/box/reflection/parameters")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Parameters extends AbstractBlackBoxCodegenTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInParameters() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection/parameters"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("javaParametersHaveDefaultNames.kt")
            public void testJavaParametersHaveDefaultNames() throws Exception {
                runTest("compiler/testData/codegen/java8/box/reflection/parameters/javaParametersHaveDefaultNames.kt");
            }
        }
    }
}
