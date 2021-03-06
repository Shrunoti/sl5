

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class clickreducer extends Reducer<Text,IntWritable,Text,IntWritable>{
	
	public void reduce(Text key,Iterable<IntWritable> value,Context context) throws IOException, InterruptedException
	{
		IntWritable result=new IntWritable();
		int count=0;
		for(IntWritable val:value)
		{
			count+=val.get();
			result.set(count);
		}
		
		context.write(key, result);
	}

}
