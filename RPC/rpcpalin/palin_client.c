/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "palin.h"
#include <string.h>


void
palin_pog_1(char *host)
{
	CLIENT *clnt;
	int  *result_1;
	palin_str  palin_1_arg;
	char str1[1000];

	printf("ENter the String");

	scanf("%s", str1);



	//result_1 = (int*)malloc(sizeof(int));


#ifndef	DEBUG
	clnt = clnt_create (host, PALIN_POG, PALIN_VERS, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */
	strcpy(palin_1_arg.str, str1); 
	

	result_1 = palin_1(&palin_1_arg, clnt);
	if (result_1 == (int *) NULL) {
		clnt_perror (clnt, "call failed");
	}

	if(*result_1 == 0)
		printf("Not\n");
	else
		printf("Is\n");
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
	char *host;

	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	palin_pog_1 (host);
exit (0);
}
