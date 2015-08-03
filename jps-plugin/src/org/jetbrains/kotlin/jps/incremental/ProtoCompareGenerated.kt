/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.jps.incremental

import org.jetbrains.kotlin.serialization.ProtoBuf
import org.jetbrains.kotlin.serialization.deserialization.NameResolver
import org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf

/** This file is generated by org.jetbrains.kotlin.generators.protobuf.GenerateProtoBufCompare. DO NOT MODIFY MANUALLY */

open class ProtoCompareGenerated(private val oldNameResolver: NameResolver, private val newNameResolver: NameResolver) {
    private val stringIdMap: MutableMap<Int, Int> = hashMapOf()
    private val fqNameIdMap: MutableMap<Int, Int> = hashMapOf()


    open fun checkEquals(old: ProtoBuf.Package, new: ProtoBuf.Package): Boolean {
        if (!checkEqualsPackageMember(old, new)) return false

        return true
    }

    open fun checkEquals(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.hasFlags() != new.hasFlags()) return false
        if (old.hasFlags()) {
            if (old.flags != new.flags) return false
        }

        if (!checkFqNameIdEquals(old.fqName, new.fqName)) return false

        if (old.hasCompanionObjectName() != new.hasCompanionObjectName()) return false
        if (old.hasCompanionObjectName()) {
            if (!checkNameIdEquals(old.companionObjectName, new.companionObjectName)) return false
        }

        if (!checkEqualsClassTypeParameter(old, new)) return false

        if (!checkEqualsClassSupertype(old, new)) return false

        if (!checkEqualsClassNestedClassName(old, new)) return false

        if (!checkEqualsClassMember(old, new)) return false

        if (!checkEqualsClassEnumEntry(old, new)) return false

        if (old.hasPrimaryConstructor() != new.hasPrimaryConstructor()) return false
        if (old.hasPrimaryConstructor()) {
            if (!checkEquals(old.primaryConstructor, new.primaryConstructor)) return false
        }

        if (!checkEqualsClassSecondaryConstructor(old, new)) return false

        if (old.getExtensionCount(JvmProtoBuf.classAnnotation) != new.getExtensionCount(JvmProtoBuf.classAnnotation)) return false

        for(i in 0..old.getExtensionCount(JvmProtoBuf.classAnnotation) - 1) {
            if (!checkEquals(old.getExtension(JvmProtoBuf.classAnnotation, i), new.getExtension(JvmProtoBuf.classAnnotation, i))) return false
        }


        return true
    }

    open fun checkEquals(old: ProtoBuf.Callable, new: ProtoBuf.Callable): Boolean {
        if (old.hasFlags() != new.hasFlags()) return false
        if (old.hasFlags()) {
            if (old.flags != new.flags) return false
        }

        if (old.hasGetterFlags() != new.hasGetterFlags()) return false
        if (old.hasGetterFlags()) {
            if (old.getterFlags != new.getterFlags) return false
        }

        if (old.hasSetterFlags() != new.hasSetterFlags()) return false
        if (old.hasSetterFlags()) {
            if (old.setterFlags != new.setterFlags) return false
        }

        if (!checkEqualsCallableTypeParameter(old, new)) return false

        if (old.hasReceiverType() != new.hasReceiverType()) return false
        if (old.hasReceiverType()) {
            if (!checkEquals(old.receiverType, new.receiverType)) return false
        }

        if (!checkNameIdEquals(old.name, new.name)) return false

        if (!checkEqualsCallableValueParameter(old, new)) return false

        if (!checkEquals(old.returnType, new.returnType)) return false

        if (old.hasExtension(JvmProtoBuf.methodSignature) != new.hasExtension(JvmProtoBuf.methodSignature)) return false
        if (old.hasExtension(JvmProtoBuf.methodSignature)) {
            if (!checkEquals(old.getExtension(JvmProtoBuf.methodSignature), new.getExtension(JvmProtoBuf.methodSignature))) return false
        }

        if (old.hasExtension(JvmProtoBuf.propertySignature) != new.hasExtension(JvmProtoBuf.propertySignature)) return false
        if (old.hasExtension(JvmProtoBuf.propertySignature)) {
            if (!checkEquals(old.getExtension(JvmProtoBuf.propertySignature), new.getExtension(JvmProtoBuf.propertySignature))) return false
        }

        if (old.hasExtension(JvmProtoBuf.implClassName) != new.hasExtension(JvmProtoBuf.implClassName)) return false
        if (old.hasExtension(JvmProtoBuf.implClassName)) {
            if (!checkNameIdEquals(old.getExtension(JvmProtoBuf.implClassName), new.getExtension(JvmProtoBuf.implClassName))) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.TypeParameter, new: ProtoBuf.TypeParameter): Boolean {
        if (old.id != new.id) return false

        if (!checkNameIdEquals(old.name, new.name)) return false

        if (old.hasReified() != new.hasReified()) return false
        if (old.hasReified()) {
            if (old.reified != new.reified) return false
        }

        if (old.hasVariance() != new.hasVariance()) return false
        if (old.hasVariance()) {
            if (old.variance != new.variance) return false
        }

        if (!checkEqualsTypeParameterUpperBound(old, new)) return false

        return true
    }

    open fun checkEquals(old: ProtoBuf.Type, new: ProtoBuf.Type): Boolean {
        if (!checkEqualsTypeArgument(old, new)) return false

        if (old.hasNullable() != new.hasNullable()) return false
        if (old.hasNullable()) {
            if (old.nullable != new.nullable) return false
        }

        if (old.hasFlexibleTypeCapabilitiesId() != new.hasFlexibleTypeCapabilitiesId()) return false
        if (old.hasFlexibleTypeCapabilitiesId()) {
            if (!checkStringIdEquals(old.flexibleTypeCapabilitiesId, new.flexibleTypeCapabilitiesId)) return false
        }

        if (old.hasFlexibleUpperBound() != new.hasFlexibleUpperBound()) return false
        if (old.hasFlexibleUpperBound()) {
            if (!checkEquals(old.flexibleUpperBound, new.flexibleUpperBound)) return false
        }

        if (old.hasConstructorClassName() != new.hasConstructorClassName()) return false
        if (old.hasConstructorClassName()) {
            if (!checkFqNameIdEquals(old.constructorClassName, new.constructorClassName)) return false
        }

        if (old.hasConstructorTypeParameter() != new.hasConstructorTypeParameter()) return false
        if (old.hasConstructorTypeParameter()) {
            if (old.constructorTypeParameter != new.constructorTypeParameter) return false
        }

        if (old.getExtensionCount(JvmProtoBuf.typeAnnotation) != new.getExtensionCount(JvmProtoBuf.typeAnnotation)) return false

        for(i in 0..old.getExtensionCount(JvmProtoBuf.typeAnnotation) - 1) {
            if (!checkEquals(old.getExtension(JvmProtoBuf.typeAnnotation, i), new.getExtension(JvmProtoBuf.typeAnnotation, i))) return false
        }


        if (old.hasExtension(JvmProtoBuf.isRaw) != new.hasExtension(JvmProtoBuf.isRaw)) return false
        if (old.hasExtension(JvmProtoBuf.isRaw)) {
            if (old.getExtension(JvmProtoBuf.isRaw) != new.getExtension(JvmProtoBuf.isRaw)) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.Class.PrimaryConstructor, new: ProtoBuf.Class.PrimaryConstructor): Boolean {
        if (old.hasData() != new.hasData()) return false
        if (old.hasData()) {
            if (!checkEquals(old.data, new.data)) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.Annotation, new: ProtoBuf.Annotation): Boolean {
        if (!checkFqNameIdEquals(old.id, new.id)) return false

        if (!checkEqualsAnnotationArgument(old, new)) return false

        return true
    }

    open fun checkEquals(old: ProtoBuf.Callable.ValueParameter, new: ProtoBuf.Callable.ValueParameter): Boolean {
        if (old.hasFlags() != new.hasFlags()) return false
        if (old.hasFlags()) {
            if (old.flags != new.flags) return false
        }

        if (!checkNameIdEquals(old.name, new.name)) return false

        if (!checkEquals(old.type, new.type)) return false

        if (old.hasVarargElementType() != new.hasVarargElementType()) return false
        if (old.hasVarargElementType()) {
            if (!checkEquals(old.varargElementType, new.varargElementType)) return false
        }

        if (old.hasExtension(JvmProtoBuf.index) != new.hasExtension(JvmProtoBuf.index)) return false
        if (old.hasExtension(JvmProtoBuf.index)) {
            if (old.getExtension(JvmProtoBuf.index) != new.getExtension(JvmProtoBuf.index)) return false
        }

        return true
    }

    open fun checkEquals(old: JvmProtoBuf.JvmMethodSignature, new: JvmProtoBuf.JvmMethodSignature): Boolean {
        if (!checkStringIdEquals(old.name, new.name)) return false

        if (!checkEquals(old.returnType, new.returnType)) return false

        if (!checkEqualsJvmMethodSignatureParameterType(old, new)) return false

        return true
    }

    open fun checkEquals(old: JvmProtoBuf.JvmPropertySignature, new: JvmProtoBuf.JvmPropertySignature): Boolean {
        if (old.hasField() != new.hasField()) return false
        if (old.hasField()) {
            if (!checkEquals(old.field, new.field)) return false
        }

        if (old.hasSyntheticMethod() != new.hasSyntheticMethod()) return false
        if (old.hasSyntheticMethod()) {
            if (!checkEquals(old.syntheticMethod, new.syntheticMethod)) return false
        }

        if (old.hasGetter() != new.hasGetter()) return false
        if (old.hasGetter()) {
            if (!checkEquals(old.getter, new.getter)) return false
        }

        if (old.hasSetter() != new.hasSetter()) return false
        if (old.hasSetter()) {
            if (!checkEquals(old.setter, new.setter)) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.Type.Argument, new: ProtoBuf.Type.Argument): Boolean {
        if (old.hasProjection() != new.hasProjection()) return false
        if (old.hasProjection()) {
            if (old.projection != new.projection) return false
        }

        if (old.hasType() != new.hasType()) return false
        if (old.hasType()) {
            if (!checkEquals(old.type, new.type)) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.Annotation.Argument, new: ProtoBuf.Annotation.Argument): Boolean {
        if (!checkNameIdEquals(old.nameId, new.nameId)) return false

        if (!checkEquals(old.value, new.value)) return false

        return true
    }

    open fun checkEquals(old: JvmProtoBuf.JvmType, new: JvmProtoBuf.JvmType): Boolean {
        if (old.hasPrimitiveType() != new.hasPrimitiveType()) return false
        if (old.hasPrimitiveType()) {
            if (old.primitiveType != new.primitiveType) return false
        }

        if (old.hasClassFqName() != new.hasClassFqName()) return false
        if (old.hasClassFqName()) {
            if (!checkFqNameIdEquals(old.classFqName, new.classFqName)) return false
        }

        if (old.hasArrayDimension() != new.hasArrayDimension()) return false
        if (old.hasArrayDimension()) {
            if (old.arrayDimension != new.arrayDimension) return false
        }

        return true
    }

    open fun checkEquals(old: JvmProtoBuf.JvmFieldSignature, new: JvmProtoBuf.JvmFieldSignature): Boolean {
        if (!checkStringIdEquals(old.name, new.name)) return false

        if (!checkEquals(old.type, new.type)) return false

        if (old.hasIsStaticInOuter() != new.hasIsStaticInOuter()) return false
        if (old.hasIsStaticInOuter()) {
            if (old.isStaticInOuter != new.isStaticInOuter) return false
        }

        return true
    }

    open fun checkEquals(old: ProtoBuf.Annotation.Argument.Value, new: ProtoBuf.Annotation.Argument.Value): Boolean {
        if (old.hasType() != new.hasType()) return false
        if (old.hasType()) {
            if (old.type != new.type) return false
        }

        if (old.hasIntValue() != new.hasIntValue()) return false
        if (old.hasIntValue()) {
            if (old.intValue != new.intValue) return false
        }

        if (old.hasFloatValue() != new.hasFloatValue()) return false
        if (old.hasFloatValue()) {
            if (old.floatValue != new.floatValue) return false
        }

        if (old.hasDoubleValue() != new.hasDoubleValue()) return false
        if (old.hasDoubleValue()) {
            if (old.doubleValue != new.doubleValue) return false
        }

        if (old.hasStringValue() != new.hasStringValue()) return false
        if (old.hasStringValue()) {
            if (!checkStringIdEquals(old.stringValue, new.stringValue)) return false
        }

        if (old.hasClassId() != new.hasClassId()) return false
        if (old.hasClassId()) {
            if (!checkFqNameIdEquals(old.classId, new.classId)) return false
        }

        if (old.hasEnumValueId() != new.hasEnumValueId()) return false
        if (old.hasEnumValueId()) {
            if (!checkNameIdEquals(old.enumValueId, new.enumValueId)) return false
        }

        if (old.hasAnnotation() != new.hasAnnotation()) return false
        if (old.hasAnnotation()) {
            if (!checkEquals(old.annotation, new.annotation)) return false
        }

        if (!checkEqualsAnnotationArgumentValueArrayElement(old, new)) return false

        return true
    }

    open fun checkEqualsPackageMember(old: ProtoBuf.Package, new: ProtoBuf.Package): Boolean {
        if (old.memberCount != new.memberCount) return false

        for(i in 0..old.memberCount - 1) {
            if (!checkEquals(old.getMember(i), new.getMember(i))) return false
        }

        return true
    }

    open fun checkEqualsClassTypeParameter(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.typeParameterCount != new.typeParameterCount) return false

        for(i in 0..old.typeParameterCount - 1) {
            if (!checkEquals(old.getTypeParameter(i), new.getTypeParameter(i))) return false
        }

        return true
    }

    open fun checkEqualsClassSupertype(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.supertypeCount != new.supertypeCount) return false

        for(i in 0..old.supertypeCount - 1) {
            if (!checkEquals(old.getSupertype(i), new.getSupertype(i))) return false
        }

        return true
    }

    open fun checkEqualsClassNestedClassName(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.nestedClassNameCount != new.nestedClassNameCount) return false

        for(i in 0..old.nestedClassNameCount - 1) {
            if (!checkNameIdEquals(old.getNestedClassName(i), new.getNestedClassName(i))) return false
        }

        return true
    }

    open fun checkEqualsClassMember(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.memberCount != new.memberCount) return false

        for(i in 0..old.memberCount - 1) {
            if (!checkEquals(old.getMember(i), new.getMember(i))) return false
        }

        return true
    }

    open fun checkEqualsClassEnumEntry(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.enumEntryCount != new.enumEntryCount) return false

        for(i in 0..old.enumEntryCount - 1) {
            if (!checkNameIdEquals(old.getEnumEntry(i), new.getEnumEntry(i))) return false
        }

        return true
    }

    open fun checkEqualsClassSecondaryConstructor(old: ProtoBuf.Class, new: ProtoBuf.Class): Boolean {
        if (old.secondaryConstructorCount != new.secondaryConstructorCount) return false

        for(i in 0..old.secondaryConstructorCount - 1) {
            if (!checkEquals(old.getSecondaryConstructor(i), new.getSecondaryConstructor(i))) return false
        }

        return true
    }

    open fun checkEqualsCallableTypeParameter(old: ProtoBuf.Callable, new: ProtoBuf.Callable): Boolean {
        if (old.typeParameterCount != new.typeParameterCount) return false

        for(i in 0..old.typeParameterCount - 1) {
            if (!checkEquals(old.getTypeParameter(i), new.getTypeParameter(i))) return false
        }

        return true
    }

    open fun checkEqualsCallableValueParameter(old: ProtoBuf.Callable, new: ProtoBuf.Callable): Boolean {
        if (old.valueParameterCount != new.valueParameterCount) return false

        for(i in 0..old.valueParameterCount - 1) {
            if (!checkEquals(old.getValueParameter(i), new.getValueParameter(i))) return false
        }

        return true
    }

    open fun checkEqualsTypeParameterUpperBound(old: ProtoBuf.TypeParameter, new: ProtoBuf.TypeParameter): Boolean {
        if (old.upperBoundCount != new.upperBoundCount) return false

        for(i in 0..old.upperBoundCount - 1) {
            if (!checkEquals(old.getUpperBound(i), new.getUpperBound(i))) return false
        }

        return true
    }

    open fun checkEqualsTypeArgument(old: ProtoBuf.Type, new: ProtoBuf.Type): Boolean {
        if (old.argumentCount != new.argumentCount) return false

        for(i in 0..old.argumentCount - 1) {
            if (!checkEquals(old.getArgument(i), new.getArgument(i))) return false
        }

        return true
    }

    open fun checkEqualsAnnotationArgument(old: ProtoBuf.Annotation, new: ProtoBuf.Annotation): Boolean {
        if (old.argumentCount != new.argumentCount) return false

        for(i in 0..old.argumentCount - 1) {
            if (!checkEquals(old.getArgument(i), new.getArgument(i))) return false
        }

        return true
    }

    open fun checkEqualsJvmMethodSignatureParameterType(old: JvmProtoBuf.JvmMethodSignature, new: JvmProtoBuf.JvmMethodSignature): Boolean {
        if (old.parameterTypeCount != new.parameterTypeCount) return false

        for(i in 0..old.parameterTypeCount - 1) {
            if (!checkEquals(old.getParameterType(i), new.getParameterType(i))) return false
        }

        return true
    }

    open fun checkEqualsAnnotationArgumentValueArrayElement(old: ProtoBuf.Annotation.Argument.Value, new: ProtoBuf.Annotation.Argument.Value): Boolean {
        if (old.arrayElementCount != new.arrayElementCount) return false

        for(i in 0..old.arrayElementCount - 1) {
            if (!checkEquals(old.getArrayElement(i), new.getArrayElement(i))) return false
        }

        return true
    }

    fun checkStringIdEquals(old: Int, new: Int): Boolean {
        stringIdMap.get(old)?.let { return it == new }

        val oldValue = oldNameResolver.stringTable.getString(old)
        val newValue = newNameResolver.stringTable.getString(new)

        return if (oldValue == newValue) { stringIdMap[old] = new; true } else false
    }

    fun checkNameIdEquals(old: Int, new: Int): Boolean  = checkStringIdEquals(old, new)

    fun checkFqNameIdEquals(old: Int, new: Int): Boolean {
        fqNameIdMap.get(old)?.let { return it == new }

        val oldValue = oldNameResolver.getFqName(old).asString()
        val newValue = newNameResolver.getFqName(new).asString()

        return if (oldValue == newValue) { fqNameIdMap[old] = new; true } else false
    }
}
