#include<stdlib.h>
#include<stdio.h>
#include "fact.h"

main(argc,argv)
int argc;
char **argv;

{

	CLIENT *cl;
	float *num;
	float *res;
	char *server;

	if(argc!=2)
	{
		fprintf(stderr,"usage %s hostname:\n",argv[0]);
		exit(1);
	}
	server=argv[1];

	num=(float *)malloc(sizeof(float));
	res=(float *)malloc(sizeof(float));

	if((cl=clnt_create(server,FACT_PROG,FACT_VERS,"udp"))==NULL)
	{
		clnt_pcreateerror(server);
		exit(0);
	}

	printf("Enter the number:\n");
	scanf("%f",num);

	if((res=fact_1(num,cl))==NULL)
	{
		clnt_perror(cl,server);
		exit(1);
	}
	printf("The factorial is:%f\n",*res);
	
	clnt_destroy(cl);
	exit(0);
}
