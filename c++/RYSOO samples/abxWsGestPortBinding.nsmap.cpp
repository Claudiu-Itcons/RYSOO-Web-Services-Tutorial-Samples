
#include "soapH.h"
SOAP_NMAC struct Namespace namespaces[] =
{
	{"SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/", "http://www.w3.org/*/soap-envelope", NULL},
	{"SOAP-ENC", "http://schemas.xmlsoap.org/soap/encoding/", "http://www.w3.org/*/soap-encoding", NULL},
	{"xsi", "http://www.w3.org/2001/XMLSchema-instance", "http://www.w3.org/*/XMLSchema-instance", NULL},
	{"xsd", "http://www.w3.org/2001/XMLSchema", "http://www.w3.org/*/XMLSchema", NULL},
	{"ns3", "http://xml.netbeans.org/schema/abxDynaminorg", NULL, NULL},
	{"ns4", "http://xml.netbeans.org/schema/abxCan", NULL, NULL},
	{"ns2", "http://xml.netbeans.org/schema/abxProtocol", NULL, NULL},
	{"ns1", "http://ws.abx/", NULL, NULL},
	{NULL, NULL, NULL, NULL}
};
