import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.fs.Path;
public class clickcount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Configuration con=new Configuration();
		Job job=new Job(con,"clickcount");
		
		job.setJarByClass(clickcount.class);
		job.setMapperClass(clickmapper.class);
		job.setReducerClass(clickreducer.class);
		
		//job.setInputFormatClass(TextInputFormat.class);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job,new Path(args[0]));
		FileOutputFormat.setOutputPath(job,new Path(args[1]));//(job,new Path(args[1]));
		System.exit(job.waitForCompletion(true)?0:1);
	}

}
