package org.asm.file;

public class VerificationTopVariable extends Verification
{
	@Override
	public VerificationType getType()
	{
		return VerificationType.ITEM_TOP;
	}

	public byte[] toByteArray()
	{
		return new byte[]{0};
	}
}
