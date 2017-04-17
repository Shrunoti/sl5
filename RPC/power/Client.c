#include<stdio.h>
#include<stdlib.h>
#include<rpc/rpc.h>
#include "fact.h"

main(argc,argv)
int argc;
char **argv;
{
	CLIENT *cl;
	char *server;
	two t;
	int *res;
	if(argc!=2)
	{
		fprintf(stderr,"usage %s hostname",argv[0]);
		exit(1);
	}
	server=argv[1];
	
	 res=(int *)malloc(sizeof(int));
	 if((cl=clnt_create(server,FACT_PROG,FACT_VERS,"udp"))==NULL)
	 {
		clnt_pcreateerror(server);
		exit(1);
	 }
	  printf("Enter the no");
	  scanf("%d",&t.a);
	  scanf("%d",&t.b);
	  if((res=fact_1(&t,cl))==NULL)
	  {
		clnt_perror(cl,server);
		exit(1);
	  }
		printf("\nPower :: %d\n",*res);
		clnt_destroy(cl);		
		exit(0);

}
