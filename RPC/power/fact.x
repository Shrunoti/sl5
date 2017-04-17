struct two
{
int a;
int b;
};
program FACT_PROG
{
	version FACT_VERS
	{
		int fact(two)=1;
	} = 1;
} =0x789;
