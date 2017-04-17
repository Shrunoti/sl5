struct palin_str{
	
	char str[1000];

};

program PALIN_POG
{
	version PALIN_VERS{

	    int palin(palin_str)=1;

	}=1;

}=0x12345678;