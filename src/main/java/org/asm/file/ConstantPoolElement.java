package org.asm.file;

public abstract class ConstantPoolElement
{
	public abstract ConstantPoolElementType getType();

	public abstract byte[] toByteArray();
}
