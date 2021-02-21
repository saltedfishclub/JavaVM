package org.asm.file;

public abstract class ElementValue
{
	private final byte type;

	public ElementValue(byte type)
	{
		this.type = type;
	}

	public byte getType()
	{
		return type;
	}

	public abstract int getLength();

	public abstract byte[] toByteArray();
}
