#include<rpc/rpc.h>
#include "fact.h"

int *fact_1_svc(two *t,struct svc_req *rqstp)
{
	int result=1;
	int a,b,i;
	a=t->a;
	b=t->b;
	for(i=1;i<=b;i++)
		result=result*a;
	return &result;
}
