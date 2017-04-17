
import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapreduce.Mapper.Context;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;;

public class clickmapper extends Mapper<LongWritable,Text,Text,IntWritable>{
	
	public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException
	{
		String s=value.toString();
		String [] a=s.split("/");
		if(a[1].length() >0)
		{
			context.write(new Text(a[1]), new IntWritable(1));
		}
		
	}

	

}
