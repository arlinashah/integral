package my.com.myriadeas.marc;

import junit.framework.TestCase;
import my.com.myriadeas.integral.cataloguing.marc4j.utility.StringToRecord;

import org.marc4j.marc.Record;

public class MarcToJsonTest extends TestCase {

	public void testMarcToRecord() {

		String marc = "01168nam a2200313 a 4500001001400000003000400014005001700018008004100035015001300076020003200089039002600121040001800147049000800165082001700173090002100190100003100211245006000242260004800302300003700350599001000387650002800397880005200425880012600477880009800603997000800701998002500709999001300734999010700747vtls000669564PNM20120228104900.0120228s1988    my |   g |    000 m tam    aM94-3130  a9679100634 (kkt.) :cRM4.50 9y201202281049zhabirah  aBNMbtamcPNM  amal04a494.811522200a494.8115bCEYdM0 6880-01aCeyaraman, Na. Vi.106880-02aAtippatait Tamil ilakkanam /cNa. Vi. Ceyaraman  6880-03aKolalampur :bUma Patippakam,c1988  a112பக். ;c18செமீ.  aLULUS10aTamil languagexGrammar0 6100-01/aசெயராமன், ந. வீ.106245-02/aஅடிப்படைத் தமிழ் இலக்கணம் /cந. வீ. செயராமன்  6260-03/aகோலாலம்பூர் :bஉமா பதிப்பகம்,c1988  aPNM  a000726850/ 000726849  aVIRTUA40  aVTLSSORT0080*0150*0200*0400*0490*0820*0900*1000*2450*2600*3000*5990*6500*8800*8801*8802*9970*9980*9992";
		StringToRecord stringToRecord = new StringToRecord();
		Record record = stringToRecord.convert(marc);
		System.out.println(record);
	}
}
