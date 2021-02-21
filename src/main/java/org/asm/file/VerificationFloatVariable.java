package org.asm.file;

public class VerificationFloatVariable extends Verification
{
	@Override
	public VerificationType getType()
	{
		return VerificationType.ITEM_FLOAT;
	}

	public byte[] toByteArray()
	{
		return new byte[]{2};
	}
}
