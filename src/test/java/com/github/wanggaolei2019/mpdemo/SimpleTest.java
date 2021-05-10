package com.github.wanggaolei2019.mpdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggl
 * @since 2021-05-07
 */
public class SimpleTest {
    
    private static final Logger logger = LoggerFactory.getLogger(SimpleTest.class);
    
    @Test
    void testSQL() {
        StringBuffer sql = new StringBuffer();
        sql.append(" select C.c_Nme_Cn as 'CNmeCn', c.C_Cvrg_No as 'CCvrgNo', c.C_Cvrg_No as 'CDispCde' , f.c_nme_cn as  'FCNameCn' , ")
                .append("f.c_risk_no as 'CRiskNo',g.C_typ  as 'CTyp',c.c_Rdr_Typ as 'CRdrTyp',c.c_CALC_AMT as 'CCalcAmt', c.N_THRESHOLD AS 'NThreshold', ")
                .append("c.c_duty_free as 'CDutyFree' ")
                .append(" from WEB_PRD_CVRG c, web_prd_cvrg_risk_rel e, web_prd_risk f , WEB_PRD_PROD_CVRG_REL g ")
                .append(" where c.c_cvrg_no = e.c_cvrg_no and f.c_risk_no = e.c_risk_no and C.C_Cvrg_No = g.C_Cvrg_No ")
                .append(" and c.c_status='1' and g.C_Prod_No = ? ORDER BY g.C_typ ");
        System.out.println(sql);
    }
    
}
