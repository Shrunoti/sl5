#include<rpc/rpc.h>
#include "ftm.h"

float *fact_1_svc(float *num,struct svc_req *rqstp)
{
         float mtr;
	 mtr=(*num)/3.28;
	 return &mtr;
	
}
