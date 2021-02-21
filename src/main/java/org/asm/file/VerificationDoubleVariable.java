package org.asm.file;

public class VerificationDoubleVariable extends Verification
{
	@Override
	public VerificationType getType()
	{
		return VerificationType.ITEM_DOUBLE;
	}

	public byte[] toByteArray()
	{
		return new byte[]{3};
	}
}
