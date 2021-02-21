package org.asm.file;

import org.vm.array.RandomAccessByteArray;

public class AnnotationReader
{
	public static StructAnnotation read(ClassFile file, RandomAccessByteArray input)
	{
		StructAnnotation annotation = new StructAnnotation();
		annotation.setTypeIndex(input.readShort());
		short count = input.readShort();
		for (int i = 0; i < count; i++)
		{
			StructElementValuePairs pairs = new StructElementValuePairs();
			pairs.setElementNameIndex(input.readShort());
			pairs.setElementValue(ElementValueReader.read(file, input));
			annotation.addElementValuePairs(pairs);
		}
		return annotation;
	}
}
