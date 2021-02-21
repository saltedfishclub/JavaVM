package org.asm.file;

public abstract class StackMapFrame
{
	private final byte frameType;

	public StackMapFrame(byte frameType)
	{
		this.frameType = frameType;
	}

	public abstract StackMapFrameType getType();

	public abstract int getLength();

	public final byte getFrameType()
	{
		return this.frameType;
	}

	public abstract byte[] toByteArray();
}
