import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
public class wordmap extends Mapper<LongWritable,Text,Text,IntWritable>{
public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException{
	String[] word=value.toString().split(" ");
	for(String w:word)
	{
		context.write(new Text(w), new IntWritable(1));
	}
	
	
	
}
}
