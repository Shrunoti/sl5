#include<rpc/rpc.h>
#include "fact.h"

float *fact_1_svc(float *num,struct svc_req *rqstp)
{
         float temp=1,i;
	 for(i=1;i<=*num;i++)
	{
	 temp=temp*i;
	}
	 return &temp;
	
}
