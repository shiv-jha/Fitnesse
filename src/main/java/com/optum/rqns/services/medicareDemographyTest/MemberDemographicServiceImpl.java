
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.medicareDemographyTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-11T17:10:23.473+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "memberDemographicService",
                      portName = "MemberDemographicServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-svcs.optum.com:8443/rqns-services-web/services/memberDemographicService?wsdl",
                      endpointInterface = "com.optum.rqns.services.medicareDemographyTest.MemberDemographicService")
                      
public class MemberDemographicServiceImpl implements MemberDemographicService {

    private static final Logger LOG = Logger.getLogger(MemberDemographicServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.medicareDemographyTest.MemberDemographicService#getMedicareMemberLatestDemographicInfo(java.lang.String  mbrHicNbr ,)java.lang.String  clientId ,)com.optum.rqns.services.medicareDemographyTest.ServiceMetaData  metaData )*
     */
    public com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo getMedicareMemberLatestDemographicInfo(java.lang.String mbrHicNbr,java.lang.String clientId,com.optum.rqns.services.medicareDemographyTest.ServiceMetaData metaData) throws ServiceException_Exception    { 
        LOG.info("Executing operation getMedicareMemberLatestDemographicInfo");
        System.out.println(mbrHicNbr);
        System.out.println(clientId);
        System.out.println(metaData);
        try {
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo _return = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo();
            _return.setClientId("ClientId1317934620");
            _return.setMbrCardId("MbrCardId-58383973");
            _return.setBaseMbrId("BaseMbrId-1127748755");
            _return.setMbrHicNbr("MbrHicNbr1427227252");
            _return.setMbrId("MbrId-1516824451");
            _return.setMbrModId("MbrModId2122240094");
            _return.setMbrFstNm("MbrFstNm-795944815");
            _return.setMbrLstNm("MbrLstNm982836182");
            _return.setMbrMidlNm("MbrMidlNm416412235");
            _return.setMbrGdrCd("MbrGdrCd-1898952535");
            _return.setMbrDob("MbrDob313284870");
            _return.setMbrDod("MbrDod237277349");
            _return.setMbrLang("MbrLang309337732");
            _return.setMaritalSts("MaritalSts-745896689");
            _return.setAddrLn1("AddrLn1-101624269");
            _return.setAddrLn2("AddrLn2-962407798");
            _return.setCity("City243458182");
            _return.setCounty("County1887541080");
            _return.setState("State-1010594752");
            _return.setZipCd("ZipCd-9027044");
            _return.setExtZipCd("ExtZipCd1293509790");
            _return.setPhoneNbr("PhoneNbr1339391875");
            _return.setAltPhoneNbr("AltPhoneNbr-146886971");
            _return.setMbrContrNbr("MbrContrNbr-2104467580");
            _return.setMbrSubPlnId("MbrSubPlnId969397726");
            _return.setMbrGlbId("MbrGlbId-1954353394");
            _return.setClntSrcSysNm("ClntSrcSysNm1643553988");
            _return.setClntSubSrcSysNm("ClntSubSrcSysNm1173246306");
            _return.setClntDvsnNm("ClntDvsnNm-1188463309");
            _return.setMbrOrigStrtDt("MbrOrigStrtDt1411808372");
            _return.setMbrLtEndDt("MbrLtEndDt-1358098471");
            _return.setMbrPoaFstNm("MbrPoaFstNm-752079374");
            _return.setMbrPoaLstNm("MbrPoaLstNm998063542");
            _return.setMbrPoaRelCd("MbrPoaRelCd-356447498");
            _return.setMbrPoaTelNumTxt("MbrPoaTelNumTxt-709127505");
            _return.setPartAEligEffDt("PartAEligEffDt513880682");
            _return.setPartBEligEffDt("PartBEligEffDt1973224002");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

    public com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList getMedicareMemberListInfoByHicId(java.lang.String mbrHicNum,java.lang.String clientId,com.optum.rqns.services.medicareDemographyTest.ServiceMetaData metaData) throws ServiceException_Exception    { 
        LOG.info("Executing operation getMedicareMemberListInfoByHicId");
        System.out.println(mbrHicNum);
        System.out.println(clientId);
        System.out.println(metaData);
        try {
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList _return = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList();
            java.util.List<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo> _returnMemberDemographicInfo = new java.util.ArrayList<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo>();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo _returnMemberDemographicInfoVal1 = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo();
            _returnMemberDemographicInfoVal1.setClientId("ClientId-1414446708");
            _returnMemberDemographicInfoVal1.setMbrCardId("MbrCardId142935733");
            _returnMemberDemographicInfoVal1.setBaseMbrId("BaseMbrId283943327");
            _returnMemberDemographicInfoVal1.setMbrHicNbr("MbrHicNbr-755728328");
            _returnMemberDemographicInfoVal1.setMbrId("MbrId1579022373");
            _returnMemberDemographicInfoVal1.setMbrModId("MbrModId-1537278843");
            _returnMemberDemographicInfoVal1.setMbrFstNm("MbrFstNm-1445171311");
            _returnMemberDemographicInfoVal1.setMbrLstNm("MbrLstNm-189230388");
            _returnMemberDemographicInfoVal1.setMbrMidlNm("MbrMidlNm1699959541");
            _returnMemberDemographicInfoVal1.setMbrGdrCd("MbrGdrCd-1993322813");
            _returnMemberDemographicInfoVal1.setMbrDob("MbrDob1192431736");
            _returnMemberDemographicInfoVal1.setMbrDod("MbrDod2072006890");
            _returnMemberDemographicInfoVal1.setMbrLang("MbrLang434101828");
            _returnMemberDemographicInfoVal1.setMaritalSts("MaritalSts-229007637");
            _returnMemberDemographicInfoVal1.setAddrLn1("AddrLn11430284733");
            _returnMemberDemographicInfoVal1.setAddrLn2("AddrLn232264666");
            _returnMemberDemographicInfoVal1.setCity("City1805139786");
            _returnMemberDemographicInfoVal1.setCounty("County1436367211");
            _returnMemberDemographicInfoVal1.setState("State-400168706");
            _returnMemberDemographicInfoVal1.setZipCd("ZipCd-1596869035");
            _returnMemberDemographicInfoVal1.setExtZipCd("ExtZipCd569126097");
            _returnMemberDemographicInfoVal1.setPhoneNbr("PhoneNbr-1914680459");
            _returnMemberDemographicInfoVal1.setAltPhoneNbr("AltPhoneNbr-56170664");
            _returnMemberDemographicInfoVal1.setMbrContrNbr("MbrContrNbr1142129787");
            _returnMemberDemographicInfoVal1.setMbrSubPlnId("MbrSubPlnId-1577071080");
            _returnMemberDemographicInfoVal1.setMbrGlbId("MbrGlbId828973590");
            _returnMemberDemographicInfoVal1.setClntSrcSysNm("ClntSrcSysNm-1671070488");
            _returnMemberDemographicInfoVal1.setClntSubSrcSysNm("ClntSubSrcSysNm807489289");
            _returnMemberDemographicInfoVal1.setClntDvsnNm("ClntDvsnNm-876502022");
            _returnMemberDemographicInfoVal1.setMbrOrigStrtDt("MbrOrigStrtDt-1998993784");
            _returnMemberDemographicInfoVal1.setMbrLtEndDt("MbrLtEndDt609912973");
            _returnMemberDemographicInfoVal1.setMbrPoaFstNm("MbrPoaFstNm-933454902");
            _returnMemberDemographicInfoVal1.setMbrPoaLstNm("MbrPoaLstNm-1743560625");
            _returnMemberDemographicInfoVal1.setMbrPoaRelCd("MbrPoaRelCd-532182077");
            _returnMemberDemographicInfoVal1.setMbrPoaTelNumTxt("MbrPoaTelNumTxt-780144653");
            _returnMemberDemographicInfoVal1.setPartAEligEffDt("PartAEligEffDt-456540850");
            _returnMemberDemographicInfoVal1.setPartBEligEffDt("PartBEligEffDt1117671314");
            _returnMemberDemographicInfo.add(_returnMemberDemographicInfoVal1);
            _return.getMemberDemographicInfo().addAll(_returnMemberDemographicInfo);
            _return.setErrorCd(Integer.valueOf(-926588583));
            _return.setErrorMsg("ErrorMsg579886029");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

	public com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList getMedicareMemberListInfoByCardId(java.lang.String mbrCardId,java.lang.String clientId,com.optum.rqns.services.medicareDemographyTest.ServiceMetaData metaData) throws ServiceException_Exception    { 
        LOG.info("Executing operation getMedicareMemberListInfoByCardId");
        System.out.println(mbrCardId);
        System.out.println(clientId);
        System.out.println(metaData);
        try {
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList _return = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList();
            java.util.List<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo> _returnMemberDemographicInfo = new java.util.ArrayList<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo>();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo _returnMemberDemographicInfoVal1 = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo();
            _returnMemberDemographicInfoVal1.setClientId("ClientId981996505");
            _returnMemberDemographicInfoVal1.setMbrCardId("MbrCardId1213348036");
            _returnMemberDemographicInfoVal1.setBaseMbrId("BaseMbrId-1883242621");
            _returnMemberDemographicInfoVal1.setMbrHicNbr("MbrHicNbr1951396961");
            _returnMemberDemographicInfoVal1.setMbrId("MbrId-2116490850");
            _returnMemberDemographicInfoVal1.setMbrModId("MbrModId-635971697");
            _returnMemberDemographicInfoVal1.setMbrFstNm("MbrFstNm1072185462");
            _returnMemberDemographicInfoVal1.setMbrLstNm("MbrLstNm587588169");
            _returnMemberDemographicInfoVal1.setMbrMidlNm("MbrMidlNm-1925489107");
            _returnMemberDemographicInfoVal1.setMbrGdrCd("MbrGdrCd1882084525");
            _returnMemberDemographicInfoVal1.setMbrDob("MbrDob240728827");
            _returnMemberDemographicInfoVal1.setMbrDod("MbrDod403085175");
            _returnMemberDemographicInfoVal1.setMbrLang("MbrLang-1835592408");
            _returnMemberDemographicInfoVal1.setMaritalSts("MaritalSts1883070602");
            _returnMemberDemographicInfoVal1.setAddrLn1("AddrLn1460124734");
            _returnMemberDemographicInfoVal1.setAddrLn2("AddrLn2-374659975");
            _returnMemberDemographicInfoVal1.setCity("City-1864983491");
            _returnMemberDemographicInfoVal1.setCounty("County-1130638296");
            _returnMemberDemographicInfoVal1.setState("State-225726747");
            _returnMemberDemographicInfoVal1.setZipCd("ZipCd118627837");
            _returnMemberDemographicInfoVal1.setExtZipCd("ExtZipCd1290648655");
            _returnMemberDemographicInfoVal1.setPhoneNbr("PhoneNbr283442242");
            _returnMemberDemographicInfoVal1.setAltPhoneNbr("AltPhoneNbr-1804642972");
            _returnMemberDemographicInfoVal1.setMbrContrNbr("MbrContrNbr63624856");
            _returnMemberDemographicInfoVal1.setMbrSubPlnId("MbrSubPlnId-1739118090");
            _returnMemberDemographicInfoVal1.setMbrGlbId("MbrGlbId888468148");
            _returnMemberDemographicInfoVal1.setClntSrcSysNm("ClntSrcSysNm85282191");
            _returnMemberDemographicInfoVal1.setClntSubSrcSysNm("ClntSubSrcSysNm844361922");
            _returnMemberDemographicInfoVal1.setClntDvsnNm("ClntDvsnNm-472364759");
            _returnMemberDemographicInfoVal1.setMbrOrigStrtDt("MbrOrigStrtDt-569988583");
            _returnMemberDemographicInfoVal1.setMbrLtEndDt("MbrLtEndDt388943728");
            _returnMemberDemographicInfoVal1.setMbrPoaFstNm("MbrPoaFstNm-748516059");
            _returnMemberDemographicInfoVal1.setMbrPoaLstNm("MbrPoaLstNm-216991686");
            _returnMemberDemographicInfoVal1.setMbrPoaRelCd("MbrPoaRelCd70553525");
            _returnMemberDemographicInfoVal1.setMbrPoaTelNumTxt("MbrPoaTelNumTxt1535682906");
            _returnMemberDemographicInfoVal1.setPartAEligEffDt("PartAEligEffDt863475990");
            _returnMemberDemographicInfoVal1.setPartBEligEffDt("PartBEligEffDt1934136833");
            _returnMemberDemographicInfo.add(_returnMemberDemographicInfoVal1);
            _return.getMemberDemographicInfo().addAll(_returnMemberDemographicInfo);
            _return.setErrorCd(Integer.valueOf(457631637));
            _return.setErrorMsg("ErrorMsg-522136771");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

	/* (non-Javadoc)
     * @see com.optum.rqns.services.medicareDemographyTest.MemberDemographicService#getMedicareMemberListInfoByHicId(com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByHicId  getMedicareMemberListInfoByHicId )*
     */
    public com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByHicIdResponse getMedicareMemberListInfoByHicId(GetMedicareMemberListInfoByHicId getMedicareMemberListInfoByHicId) throws ServiceException_Exception    { 
        LOG.info("Executing operation getMedicareMemberListInfoByHicId");
        System.out.println(getMedicareMemberListInfoByHicId);
        try {
            com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByHicIdResponse _return = new com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByHicIdResponse();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList _returnMedicareMemberDemographicInfoList = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList();
            java.util.List<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo> _returnMedicareMemberDemographicInfoListMemberDemographicInfo = new java.util.ArrayList<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo>();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1 = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo();
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClientId("ClientId183790238");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrCardId("MbrCardId-929592650");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setBaseMbrId("BaseMbrId1241353383");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrHicNbr("MbrHicNbr478539846");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrId("MbrId-719620992");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrModId("MbrModId-773115630");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrFstNm("MbrFstNm46701319");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLstNm("MbrLstNm749761499");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrMidlNm("MbrMidlNm-1005508798");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrGdrCd("MbrGdrCd-557099306");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrDob("MbrDob-1716992360");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrDod("MbrDod-1294698216");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLang("MbrLang632195039");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMaritalSts("MaritalSts290467953");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAddrLn1("AddrLn11917606769");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAddrLn2("AddrLn2-660117851");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setCity("City-1891677529");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setCounty("County1842013288");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setState("State-2023947424");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setZipCd("ZipCd451325326");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setExtZipCd("ExtZipCd-861304695");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPhoneNbr("PhoneNbr1849217349");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAltPhoneNbr("AltPhoneNbr-664942907");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrContrNbr("MbrContrNbr266011225");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrSubPlnId("MbrSubPlnId1107625108");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrGlbId("MbrGlbId97566414");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntSrcSysNm("ClntSrcSysNm988657597");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntSubSrcSysNm("ClntSubSrcSysNm1672319834");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntDvsnNm("ClntDvsnNm-668809797");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrOrigStrtDt("MbrOrigStrtDt-476746118");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLtEndDt("MbrLtEndDt602385282");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaFstNm("MbrPoaFstNm-1683369916");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaLstNm("MbrPoaLstNm-1924265768");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaRelCd("MbrPoaRelCd27016992");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaTelNumTxt("MbrPoaTelNumTxt561620496");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPartAEligEffDt("PartAEligEffDt-1877240061");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPartBEligEffDt("PartBEligEffDt547081971");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfo.add(_returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1);
            _returnMedicareMemberDemographicInfoList.getMemberDemographicInfo().addAll(_returnMedicareMemberDemographicInfoListMemberDemographicInfo);
            _returnMedicareMemberDemographicInfoList.setErrorCd(Integer.valueOf(778950641));
            _returnMedicareMemberDemographicInfoList.setErrorMsg("ErrorMsg1674894348");
            _return.setMedicareMemberDemographicInfoList(_returnMedicareMemberDemographicInfoList);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

    /* (non-Javadoc)
     * @see com.optum.rqns.services.medicareDemographyTest.MemberDemographicService#getMedicareMemberListInfoByCardId(com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByCardId  getMedicareMemberListInfoByCardId )*
     */
    public com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByCardIdResponse getMedicareMemberListInfoByCardId(GetMedicareMemberListInfoByCardId getMedicareMemberListInfoByCardId) throws ServiceException_Exception    { 
        LOG.info("Executing operation getMedicareMemberListInfoByCardId");
        System.out.println(getMedicareMemberListInfoByCardId);
        try {
            com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByCardIdResponse _return = new com.optum.rqns.services.medicareDemographyTest.GetMedicareMemberListInfoByCardIdResponse();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList _returnMedicareMemberDemographicInfoList = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfoList();
            java.util.List<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo> _returnMedicareMemberDemographicInfoListMemberDemographicInfo = new java.util.ArrayList<com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo>();
            com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1 = new com.optum.rqns.services.medicareDemographyTest.MedicareMemberDemographicInfo();
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClientId("ClientId925030857");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrCardId("MbrCardId128879555");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setBaseMbrId("BaseMbrId-640545112");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrHicNbr("MbrHicNbr1891725025");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrId("MbrId2127762023");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrModId("MbrModId-1188579212");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrFstNm("MbrFstNm364346623");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLstNm("MbrLstNm-177256660");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrMidlNm("MbrMidlNm1401296605");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrGdrCd("MbrGdrCd425283242");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrDob("MbrDob838498660");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrDod("MbrDod999272793");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLang("MbrLang498017076");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMaritalSts("MaritalSts-1889177659");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAddrLn1("AddrLn11440114413");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAddrLn2("AddrLn2-1722179442");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setCity("City-1443615606");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setCounty("County-2028290970");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setState("State-418934648");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setZipCd("ZipCd-237716537");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setExtZipCd("ExtZipCd-1944006291");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPhoneNbr("PhoneNbr1002446898");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setAltPhoneNbr("AltPhoneNbr-866974858");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrContrNbr("MbrContrNbr300259649");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrSubPlnId("MbrSubPlnId854031212");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrGlbId("MbrGlbId-236251691");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntSrcSysNm("ClntSrcSysNm-1165157127");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntSubSrcSysNm("ClntSubSrcSysNm425184284");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setClntDvsnNm("ClntDvsnNm1956283883");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrOrigStrtDt("MbrOrigStrtDt-559438006");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrLtEndDt("MbrLtEndDt-946946229");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaFstNm("MbrPoaFstNm-1010259909");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaLstNm("MbrPoaLstNm-716145097");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaRelCd("MbrPoaRelCd15314520");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setMbrPoaTelNumTxt("MbrPoaTelNumTxt-1324064302");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPartAEligEffDt("PartAEligEffDt102752366");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1.setPartBEligEffDt("PartBEligEffDt-226242343");
            _returnMedicareMemberDemographicInfoListMemberDemographicInfo.add(_returnMedicareMemberDemographicInfoListMemberDemographicInfoVal1);
            _returnMedicareMemberDemographicInfoList.getMemberDemographicInfo().addAll(_returnMedicareMemberDemographicInfoListMemberDemographicInfo);
            _returnMedicareMemberDemographicInfoList.setErrorCd(Integer.valueOf(196286815));
            _returnMedicareMemberDemographicInfoList.setErrorMsg("ErrorMsg1300328594");
            _return.setMedicareMemberDemographicInfoList(_returnMedicareMemberDemographicInfoList);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
