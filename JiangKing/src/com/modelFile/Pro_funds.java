package com.my.db;

public class Pro_funds {
  private String pro_code;
  private String ta_code;
  private String ta_name;
  private String ta_name_abbr;
  private String comp_code;
  private String fund_type;
  private String inv_industry;
  private String first_subscribe_min;
  private String first_subscribe_max;
  private String add_subscribe_min;
  private String add_subscribe_max;
  private String buy_min_fc;
  private String buy_max_fc;
  private String first_buy_min_fc;
  private String first_buy_max_fc;
  private String add_buy_min_fc;
  private String add_buy_max_fc;
  private String aip_min_fc;
  private String aip_max_fc;
  private String sale_min_fc;
  private String sale_max_fc;
  private String convert_min_fc;
  private String convert_max_fc;
  private String analysis_bm_lipper_id;
  private String buy_min_lc;
  private String buy_max_lc;
  private String first_buy_min_lc;
  private String first_buy_max_lc;
  private String add_buy_min_lc;
  private String add_buy_max_lc;
  private String aip_min_lc;
  private String aip_max_lc;
  private String sale_min_lc;
  private String sale_max_lc;
  private String convert_min_lc;
  private String convert_max_lc;
  private String sale_min_unit;
  private String unit_round_digits;
  private String is_s_allot;
  private String is_rsp_allot;
  private String is_rdm;
  private String is_switchin;
  private String is_switchout;
  private String np_party_no;
  private String liqui_party_no;
  private String reg_party_no;
  private String collect_party_no;
  private String fee_mgr_rate;
  private String fee_smt_rate;
  private String server_fee;
  private String commission_fee;
  private String geo_focus_code;
  private String income_dist_code;
  private String consignment;
  private String lipper_id;
  private java.sql.Timestamp create_dt;
  private java.sql.Timestamp modify_dt;
  private String create_by;
  private String modify_by;
  private String pro_charge_type;
  private String fund_manager_code;
  private String fund_manager_name;
  private String indi_sale_min_unit;
  private String inst_sale_min_unit;
  private String indi_min_balance_unit;
  private String inst_min_balance_unit;
  private String indi_sale_max_unit;
  private String inst_sale_max_unit;
  private String convert_status;
  private String min_convert_unit;
  private String is_guaranteed_fund;
  private String is_lof_fund;
  private String is_qdii_fund;
  private String is_etf_fund;
  private String def_dividend_method;
  private String buy_upper_amount;
  private String covert_in_upper_amount;
  private String inst_app_subs_amnt;
  private String inst_app_subs_vol;
  private String min_amount_by_inst;
  private String min_vol_by_inst;
  private String max_redemption_vol;
  private String min_account_balance;
  private String indi_app_subs_vol;
  private String indi_app_subs_amount;
  private String min_subs_vol_by_indi;
  private String min_subs_amount_by_indi;
  private String max_subs_vol_by_indi;
  private String max_subs_amount_by_indi;
  private String max_subs_vol_by_inst;
  private String max_subs_amount_by_inst;
  private String min_bids_amount_by_inst;
  private String min_app_bids_amount_by_indi;
  private String min_app_bids_amount_by_inst;
  private String indi_max_purchase;
  private String inst_max_purchase;
  private String indi_day_max_sum_buy;
  private String inst_day_max_sum_buy;
  private String indi_day_max_sum_redeem;
  private String inst_day_max_sum_redeem;
  private String periodic_status;
  private String transfer_agency_status;
  private java.sql.Date divident_date;
  private String min_bids_amount_by_indi;
  private java.sql.Date registration_date;
  private java.sql.Date xr_date;
  private String custodian_code;
  private String issue_type_by_indi;
  private String issue_type_by_inst;
  private String amount_of_periodicsubs;
  private java.sql.Date date_of_periodicsubs;
  private String subs_type;
  private String unit_subsvol_by_indi;
  private String unit_subsvol_by_inst;
  private String unit_subsamt_by_indi;
  private String unit_subsamt_by_inst;
  private String amt_of_perio_subs_by_indi;
  private String amt_of_perio_subs_by_inst;
  private String period_subupper_amt;
  private String redeemfee_backratio;
  private String collect_fee_type;
  private String issue_fee;
  private String perf_roy_type;
  private String perf_roy_pct;
  private String subscribe_fee;
  private String tran_fee_type;
  private java.sql.Date trade_start_dt;
  private java.sql.Date trade_end_dt;
  private String fund_level;
  private String hold_limit_yn;
  private String hold_limit;
  private String hold_limit_type;
  private String subscribe_fee_yn;
  private String buy_fee_yn;
  private String sell_fee_yn;
  private String trail_commission;
  private String trail_comm_share_ratio;
  private String tradable_yn;
  private String income_feature1;
  private String income_feature2;
  private String subscribe_fee_discount;
  private String buy_fee_discount;
  private String sell_fee_discount;
  private String mandator;
  private String bypase_yn;
  private String expect_rate;
  private String expect_rate_type;

  public String getPro_code() {
    return pro_code;
  }

  public void setPro_code(String pro_code) {
    this.pro_code = pro_code;
  }

  public String getTa_code() {
    return ta_code;
  }

  public void setTa_code(String ta_code) {
    this.ta_code = ta_code;
  }

  public String getTa_name() {
    return ta_name;
  }

  public void setTa_name(String ta_name) {
    this.ta_name = ta_name;
  }

  public String getTa_name_abbr() {
    return ta_name_abbr;
  }

  public void setTa_name_abbr(String ta_name_abbr) {
    this.ta_name_abbr = ta_name_abbr;
  }

  public String getComp_code() {
    return comp_code;
  }

  public void setComp_code(String comp_code) {
    this.comp_code = comp_code;
  }

  public String getFund_type() {
    return fund_type;
  }

  public void setFund_type(String fund_type) {
    this.fund_type = fund_type;
  }

  public String getInv_industry() {
    return inv_industry;
  }

  public void setInv_industry(String inv_industry) {
    this.inv_industry = inv_industry;
  }

  public String getFirst_subscribe_min() {
    return first_subscribe_min;
  }

  public void setFirst_subscribe_min(String first_subscribe_min) {
    this.first_subscribe_min = first_subscribe_min;
  }

  public String getFirst_subscribe_max() {
    return first_subscribe_max;
  }

  public void setFirst_subscribe_max(String first_subscribe_max) {
    this.first_subscribe_max = first_subscribe_max;
  }

  public String getAdd_subscribe_min() {
    return add_subscribe_min;
  }

  public void setAdd_subscribe_min(String add_subscribe_min) {
    this.add_subscribe_min = add_subscribe_min;
  }

  public String getAdd_subscribe_max() {
    return add_subscribe_max;
  }

  public void setAdd_subscribe_max(String add_subscribe_max) {
    this.add_subscribe_max = add_subscribe_max;
  }

  public String getBuy_min_fc() {
    return buy_min_fc;
  }

  public void setBuy_min_fc(String buy_min_fc) {
    this.buy_min_fc = buy_min_fc;
  }

  public String getBuy_max_fc() {
    return buy_max_fc;
  }

  public void setBuy_max_fc(String buy_max_fc) {
    this.buy_max_fc = buy_max_fc;
  }

  public String getFirst_buy_min_fc() {
    return first_buy_min_fc;
  }

  public void setFirst_buy_min_fc(String first_buy_min_fc) {
    this.first_buy_min_fc = first_buy_min_fc;
  }

  public String getFirst_buy_max_fc() {
    return first_buy_max_fc;
  }

  public void setFirst_buy_max_fc(String first_buy_max_fc) {
    this.first_buy_max_fc = first_buy_max_fc;
  }

  public String getAdd_buy_min_fc() {
    return add_buy_min_fc;
  }

  public void setAdd_buy_min_fc(String add_buy_min_fc) {
    this.add_buy_min_fc = add_buy_min_fc;
  }

  public String getAdd_buy_max_fc() {
    return add_buy_max_fc;
  }

  public void setAdd_buy_max_fc(String add_buy_max_fc) {
    this.add_buy_max_fc = add_buy_max_fc;
  }

  public String getAip_min_fc() {
    return aip_min_fc;
  }

  public void setAip_min_fc(String aip_min_fc) {
    this.aip_min_fc = aip_min_fc;
  }

  public String getAip_max_fc() {
    return aip_max_fc;
  }

  public void setAip_max_fc(String aip_max_fc) {
    this.aip_max_fc = aip_max_fc;
  }

  public String getSale_min_fc() {
    return sale_min_fc;
  }

  public void setSale_min_fc(String sale_min_fc) {
    this.sale_min_fc = sale_min_fc;
  }

  public String getSale_max_fc() {
    return sale_max_fc;
  }

  public void setSale_max_fc(String sale_max_fc) {
    this.sale_max_fc = sale_max_fc;
  }

  public String getConvert_min_fc() {
    return convert_min_fc;
  }

  public void setConvert_min_fc(String convert_min_fc) {
    this.convert_min_fc = convert_min_fc;
  }

  public String getConvert_max_fc() {
    return convert_max_fc;
  }

  public void setConvert_max_fc(String convert_max_fc) {
    this.convert_max_fc = convert_max_fc;
  }

  public String getAnalysis_bm_lipper_id() {
    return analysis_bm_lipper_id;
  }

  public void setAnalysis_bm_lipper_id(String analysis_bm_lipper_id) {
    this.analysis_bm_lipper_id = analysis_bm_lipper_id;
  }

  public String getBuy_min_lc() {
    return buy_min_lc;
  }

  public void setBuy_min_lc(String buy_min_lc) {
    this.buy_min_lc = buy_min_lc;
  }

  public String getBuy_max_lc() {
    return buy_max_lc;
  }

  public void setBuy_max_lc(String buy_max_lc) {
    this.buy_max_lc = buy_max_lc;
  }

  public String getFirst_buy_min_lc() {
    return first_buy_min_lc;
  }

  public void setFirst_buy_min_lc(String first_buy_min_lc) {
    this.first_buy_min_lc = first_buy_min_lc;
  }

  public String getFirst_buy_max_lc() {
    return first_buy_max_lc;
  }

  public void setFirst_buy_max_lc(String first_buy_max_lc) {
    this.first_buy_max_lc = first_buy_max_lc;
  }

  public String getAdd_buy_min_lc() {
    return add_buy_min_lc;
  }

  public void setAdd_buy_min_lc(String add_buy_min_lc) {
    this.add_buy_min_lc = add_buy_min_lc;
  }

  public String getAdd_buy_max_lc() {
    return add_buy_max_lc;
  }

  public void setAdd_buy_max_lc(String add_buy_max_lc) {
    this.add_buy_max_lc = add_buy_max_lc;
  }

  public String getAip_min_lc() {
    return aip_min_lc;
  }

  public void setAip_min_lc(String aip_min_lc) {
    this.aip_min_lc = aip_min_lc;
  }

  public String getAip_max_lc() {
    return aip_max_lc;
  }

  public void setAip_max_lc(String aip_max_lc) {
    this.aip_max_lc = aip_max_lc;
  }

  public String getSale_min_lc() {
    return sale_min_lc;
  }

  public void setSale_min_lc(String sale_min_lc) {
    this.sale_min_lc = sale_min_lc;
  }

  public String getSale_max_lc() {
    return sale_max_lc;
  }

  public void setSale_max_lc(String sale_max_lc) {
    this.sale_max_lc = sale_max_lc;
  }

  public String getConvert_min_lc() {
    return convert_min_lc;
  }

  public void setConvert_min_lc(String convert_min_lc) {
    this.convert_min_lc = convert_min_lc;
  }

  public String getConvert_max_lc() {
    return convert_max_lc;
  }

  public void setConvert_max_lc(String convert_max_lc) {
    this.convert_max_lc = convert_max_lc;
  }

  public String getSale_min_unit() {
    return sale_min_unit;
  }

  public void setSale_min_unit(String sale_min_unit) {
    this.sale_min_unit = sale_min_unit;
  }

  public String getUnit_round_digits() {
    return unit_round_digits;
  }

  public void setUnit_round_digits(String unit_round_digits) {
    this.unit_round_digits = unit_round_digits;
  }

  public String getIs_s_allot() {
    return is_s_allot;
  }

  public void setIs_s_allot(String is_s_allot) {
    this.is_s_allot = is_s_allot;
  }

  public String getIs_rsp_allot() {
    return is_rsp_allot;
  }

  public void setIs_rsp_allot(String is_rsp_allot) {
    this.is_rsp_allot = is_rsp_allot;
  }

  public String getIs_rdm() {
    return is_rdm;
  }

  public void setIs_rdm(String is_rdm) {
    this.is_rdm = is_rdm;
  }

  public String getIs_switchin() {
    return is_switchin;
  }

  public void setIs_switchin(String is_switchin) {
    this.is_switchin = is_switchin;
  }

  public String getIs_switchout() {
    return is_switchout;
  }

  public void setIs_switchout(String is_switchout) {
    this.is_switchout = is_switchout;
  }

  public String getNp_party_no() {
    return np_party_no;
  }

  public void setNp_party_no(String np_party_no) {
    this.np_party_no = np_party_no;
  }

  public String getLiqui_party_no() {
    return liqui_party_no;
  }

  public void setLiqui_party_no(String liqui_party_no) {
    this.liqui_party_no = liqui_party_no;
  }

  public String getReg_party_no() {
    return reg_party_no;
  }

  public void setReg_party_no(String reg_party_no) {
    this.reg_party_no = reg_party_no;
  }

  public String getCollect_party_no() {
    return collect_party_no;
  }

  public void setCollect_party_no(String collect_party_no) {
    this.collect_party_no = collect_party_no;
  }

  public String getFee_mgr_rate() {
    return fee_mgr_rate;
  }

  public void setFee_mgr_rate(String fee_mgr_rate) {
    this.fee_mgr_rate = fee_mgr_rate;
  }

  public String getFee_smt_rate() {
    return fee_smt_rate;
  }

  public void setFee_smt_rate(String fee_smt_rate) {
    this.fee_smt_rate = fee_smt_rate;
  }

  public String getServer_fee() {
    return server_fee;
  }

  public void setServer_fee(String server_fee) {
    this.server_fee = server_fee;
  }

  public String getCommission_fee() {
    return commission_fee;
  }

  public void setCommission_fee(String commission_fee) {
    this.commission_fee = commission_fee;
  }

  public String getGeo_focus_code() {
    return geo_focus_code;
  }

  public void setGeo_focus_code(String geo_focus_code) {
    this.geo_focus_code = geo_focus_code;
  }

  public String getIncome_dist_code() {
    return income_dist_code;
  }

  public void setIncome_dist_code(String income_dist_code) {
    this.income_dist_code = income_dist_code;
  }

  public String getConsignment() {
    return consignment;
  }

  public void setConsignment(String consignment) {
    this.consignment = consignment;
  }

  public String getLipper_id() {
    return lipper_id;
  }

  public void setLipper_id(String lipper_id) {
    this.lipper_id = lipper_id;
  }

  public java.sql.Timestamp getCreate_dt() {
    return create_dt;
  }

  public void setCreate_dt(java.sql.Timestamp create_dt) {
    this.create_dt = create_dt;
  }

  public java.sql.Timestamp getModify_dt() {
    return modify_dt;
  }

  public void setModify_dt(java.sql.Timestamp modify_dt) {
    this.modify_dt = modify_dt;
  }

  public String getCreate_by() {
    return create_by;
  }

  public void setCreate_by(String create_by) {
    this.create_by = create_by;
  }

  public String getModify_by() {
    return modify_by;
  }

  public void setModify_by(String modify_by) {
    this.modify_by = modify_by;
  }

  public String getPro_charge_type() {
    return pro_charge_type;
  }

  public void setPro_charge_type(String pro_charge_type) {
    this.pro_charge_type = pro_charge_type;
  }

  public String getFund_manager_code() {
    return fund_manager_code;
  }

  public void setFund_manager_code(String fund_manager_code) {
    this.fund_manager_code = fund_manager_code;
  }

  public String getFund_manager_name() {
    return fund_manager_name;
  }

  public void setFund_manager_name(String fund_manager_name) {
    this.fund_manager_name = fund_manager_name;
  }

  public String getIndi_sale_min_unit() {
    return indi_sale_min_unit;
  }

  public void setIndi_sale_min_unit(String indi_sale_min_unit) {
    this.indi_sale_min_unit = indi_sale_min_unit;
  }

  public String getInst_sale_min_unit() {
    return inst_sale_min_unit;
  }

  public void setInst_sale_min_unit(String inst_sale_min_unit) {
    this.inst_sale_min_unit = inst_sale_min_unit;
  }

  public String getIndi_min_balance_unit() {
    return indi_min_balance_unit;
  }

  public void setIndi_min_balance_unit(String indi_min_balance_unit) {
    this.indi_min_balance_unit = indi_min_balance_unit;
  }

  public String getInst_min_balance_unit() {
    return inst_min_balance_unit;
  }

  public void setInst_min_balance_unit(String inst_min_balance_unit) {
    this.inst_min_balance_unit = inst_min_balance_unit;
  }

  public String getIndi_sale_max_unit() {
    return indi_sale_max_unit;
  }

  public void setIndi_sale_max_unit(String indi_sale_max_unit) {
    this.indi_sale_max_unit = indi_sale_max_unit;
  }

  public String getInst_sale_max_unit() {
    return inst_sale_max_unit;
  }

  public void setInst_sale_max_unit(String inst_sale_max_unit) {
    this.inst_sale_max_unit = inst_sale_max_unit;
  }

  public String getConvert_status() {
    return convert_status;
  }

  public void setConvert_status(String convert_status) {
    this.convert_status = convert_status;
  }

  public String getMin_convert_unit() {
    return min_convert_unit;
  }

  public void setMin_convert_unit(String min_convert_unit) {
    this.min_convert_unit = min_convert_unit;
  }

  public String getIs_guaranteed_fund() {
    return is_guaranteed_fund;
  }

  public void setIs_guaranteed_fund(String is_guaranteed_fund) {
    this.is_guaranteed_fund = is_guaranteed_fund;
  }

  public String getIs_lof_fund() {
    return is_lof_fund;
  }

  public void setIs_lof_fund(String is_lof_fund) {
    this.is_lof_fund = is_lof_fund;
  }

  public String getIs_qdii_fund() {
    return is_qdii_fund;
  }

  public void setIs_qdii_fund(String is_qdii_fund) {
    this.is_qdii_fund = is_qdii_fund;
  }

  public String getIs_etf_fund() {
    return is_etf_fund;
  }

  public void setIs_etf_fund(String is_etf_fund) {
    this.is_etf_fund = is_etf_fund;
  }

  public String getDef_dividend_method() {
    return def_dividend_method;
  }

  public void setDef_dividend_method(String def_dividend_method) {
    this.def_dividend_method = def_dividend_method;
  }

  public String getBuy_upper_amount() {
    return buy_upper_amount;
  }

  public void setBuy_upper_amount(String buy_upper_amount) {
    this.buy_upper_amount = buy_upper_amount;
  }

  public String getCovert_in_upper_amount() {
    return covert_in_upper_amount;
  }

  public void setCovert_in_upper_amount(String covert_in_upper_amount) {
    this.covert_in_upper_amount = covert_in_upper_amount;
  }

  public String getInst_app_subs_amnt() {
    return inst_app_subs_amnt;
  }

  public void setInst_app_subs_amnt(String inst_app_subs_amnt) {
    this.inst_app_subs_amnt = inst_app_subs_amnt;
  }

  public String getInst_app_subs_vol() {
    return inst_app_subs_vol;
  }

  public void setInst_app_subs_vol(String inst_app_subs_vol) {
    this.inst_app_subs_vol = inst_app_subs_vol;
  }

  public String getMin_amount_by_inst() {
    return min_amount_by_inst;
  }

  public void setMin_amount_by_inst(String min_amount_by_inst) {
    this.min_amount_by_inst = min_amount_by_inst;
  }

  public String getMin_vol_by_inst() {
    return min_vol_by_inst;
  }

  public void setMin_vol_by_inst(String min_vol_by_inst) {
    this.min_vol_by_inst = min_vol_by_inst;
  }

  public String getMax_redemption_vol() {
    return max_redemption_vol;
  }

  public void setMax_redemption_vol(String max_redemption_vol) {
    this.max_redemption_vol = max_redemption_vol;
  }

  public String getMin_account_balance() {
    return min_account_balance;
  }

  public void setMin_account_balance(String min_account_balance) {
    this.min_account_balance = min_account_balance;
  }

  public String getIndi_app_subs_vol() {
    return indi_app_subs_vol;
  }

  public void setIndi_app_subs_vol(String indi_app_subs_vol) {
    this.indi_app_subs_vol = indi_app_subs_vol;
  }

  public String getIndi_app_subs_amount() {
    return indi_app_subs_amount;
  }

  public void setIndi_app_subs_amount(String indi_app_subs_amount) {
    this.indi_app_subs_amount = indi_app_subs_amount;
  }

  public String getMin_subs_vol_by_indi() {
    return min_subs_vol_by_indi;
  }

  public void setMin_subs_vol_by_indi(String min_subs_vol_by_indi) {
    this.min_subs_vol_by_indi = min_subs_vol_by_indi;
  }

  public String getMin_subs_amount_by_indi() {
    return min_subs_amount_by_indi;
  }

  public void setMin_subs_amount_by_indi(String min_subs_amount_by_indi) {
    this.min_subs_amount_by_indi = min_subs_amount_by_indi;
  }

  public String getMax_subs_vol_by_indi() {
    return max_subs_vol_by_indi;
  }

  public void setMax_subs_vol_by_indi(String max_subs_vol_by_indi) {
    this.max_subs_vol_by_indi = max_subs_vol_by_indi;
  }

  public String getMax_subs_amount_by_indi() {
    return max_subs_amount_by_indi;
  }

  public void setMax_subs_amount_by_indi(String max_subs_amount_by_indi) {
    this.max_subs_amount_by_indi = max_subs_amount_by_indi;
  }

  public String getMax_subs_vol_by_inst() {
    return max_subs_vol_by_inst;
  }

  public void setMax_subs_vol_by_inst(String max_subs_vol_by_inst) {
    this.max_subs_vol_by_inst = max_subs_vol_by_inst;
  }

  public String getMax_subs_amount_by_inst() {
    return max_subs_amount_by_inst;
  }

  public void setMax_subs_amount_by_inst(String max_subs_amount_by_inst) {
    this.max_subs_amount_by_inst = max_subs_amount_by_inst;
  }

  public String getMin_bids_amount_by_inst() {
    return min_bids_amount_by_inst;
  }

  public void setMin_bids_amount_by_inst(String min_bids_amount_by_inst) {
    this.min_bids_amount_by_inst = min_bids_amount_by_inst;
  }

  public String getMin_app_bids_amount_by_indi() {
    return min_app_bids_amount_by_indi;
  }

  public void setMin_app_bids_amount_by_indi(String min_app_bids_amount_by_indi) {
    this.min_app_bids_amount_by_indi = min_app_bids_amount_by_indi;
  }

  public String getMin_app_bids_amount_by_inst() {
    return min_app_bids_amount_by_inst;
  }

  public void setMin_app_bids_amount_by_inst(String min_app_bids_amount_by_inst) {
    this.min_app_bids_amount_by_inst = min_app_bids_amount_by_inst;
  }

  public String getIndi_max_purchase() {
    return indi_max_purchase;
  }

  public void setIndi_max_purchase(String indi_max_purchase) {
    this.indi_max_purchase = indi_max_purchase;
  }

  public String getInst_max_purchase() {
    return inst_max_purchase;
  }

  public void setInst_max_purchase(String inst_max_purchase) {
    this.inst_max_purchase = inst_max_purchase;
  }

  public String getIndi_day_max_sum_buy() {
    return indi_day_max_sum_buy;
  }

  public void setIndi_day_max_sum_buy(String indi_day_max_sum_buy) {
    this.indi_day_max_sum_buy = indi_day_max_sum_buy;
  }

  public String getInst_day_max_sum_buy() {
    return inst_day_max_sum_buy;
  }

  public void setInst_day_max_sum_buy(String inst_day_max_sum_buy) {
    this.inst_day_max_sum_buy = inst_day_max_sum_buy;
  }

  public String getIndi_day_max_sum_redeem() {
    return indi_day_max_sum_redeem;
  }

  public void setIndi_day_max_sum_redeem(String indi_day_max_sum_redeem) {
    this.indi_day_max_sum_redeem = indi_day_max_sum_redeem;
  }

  public String getInst_day_max_sum_redeem() {
    return inst_day_max_sum_redeem;
  }

  public void setInst_day_max_sum_redeem(String inst_day_max_sum_redeem) {
    this.inst_day_max_sum_redeem = inst_day_max_sum_redeem;
  }

  public String getPeriodic_status() {
    return periodic_status;
  }

  public void setPeriodic_status(String periodic_status) {
    this.periodic_status = periodic_status;
  }

  public String getTransfer_agency_status() {
    return transfer_agency_status;
  }

  public void setTransfer_agency_status(String transfer_agency_status) {
    this.transfer_agency_status = transfer_agency_status;
  }

  public java.sql.Date getDivident_date() {
    return divident_date;
  }

  public void setDivident_date(java.sql.Date divident_date) {
    this.divident_date = divident_date;
  }

  public String getMin_bids_amount_by_indi() {
    return min_bids_amount_by_indi;
  }

  public void setMin_bids_amount_by_indi(String min_bids_amount_by_indi) {
    this.min_bids_amount_by_indi = min_bids_amount_by_indi;
  }

  public java.sql.Date getRegistration_date() {
    return registration_date;
  }

  public void setRegistration_date(java.sql.Date registration_date) {
    this.registration_date = registration_date;
  }

  public java.sql.Date getXr_date() {
    return xr_date;
  }

  public void setXr_date(java.sql.Date xr_date) {
    this.xr_date = xr_date;
  }

  public String getCustodian_code() {
    return custodian_code;
  }

  public void setCustodian_code(String custodian_code) {
    this.custodian_code = custodian_code;
  }

  public String getIssue_type_by_indi() {
    return issue_type_by_indi;
  }

  public void setIssue_type_by_indi(String issue_type_by_indi) {
    this.issue_type_by_indi = issue_type_by_indi;
  }

  public String getIssue_type_by_inst() {
    return issue_type_by_inst;
  }

  public void setIssue_type_by_inst(String issue_type_by_inst) {
    this.issue_type_by_inst = issue_type_by_inst;
  }

  public String getAmount_of_periodicsubs() {
    return amount_of_periodicsubs;
  }

  public void setAmount_of_periodicsubs(String amount_of_periodicsubs) {
    this.amount_of_periodicsubs = amount_of_periodicsubs;
  }

  public java.sql.Date getDate_of_periodicsubs() {
    return date_of_periodicsubs;
  }

  public void setDate_of_periodicsubs(java.sql.Date date_of_periodicsubs) {
    this.date_of_periodicsubs = date_of_periodicsubs;
  }

  public String getSubs_type() {
    return subs_type;
  }

  public void setSubs_type(String subs_type) {
    this.subs_type = subs_type;
  }

  public String getUnit_subsvol_by_indi() {
    return unit_subsvol_by_indi;
  }

  public void setUnit_subsvol_by_indi(String unit_subsvol_by_indi) {
    this.unit_subsvol_by_indi = unit_subsvol_by_indi;
  }

  public String getUnit_subsvol_by_inst() {
    return unit_subsvol_by_inst;
  }

  public void setUnit_subsvol_by_inst(String unit_subsvol_by_inst) {
    this.unit_subsvol_by_inst = unit_subsvol_by_inst;
  }

  public String getUnit_subsamt_by_indi() {
    return unit_subsamt_by_indi;
  }

  public void setUnit_subsamt_by_indi(String unit_subsamt_by_indi) {
    this.unit_subsamt_by_indi = unit_subsamt_by_indi;
  }

  public String getUnit_subsamt_by_inst() {
    return unit_subsamt_by_inst;
  }

  public void setUnit_subsamt_by_inst(String unit_subsamt_by_inst) {
    this.unit_subsamt_by_inst = unit_subsamt_by_inst;
  }

  public String getAmt_of_perio_subs_by_indi() {
    return amt_of_perio_subs_by_indi;
  }

  public void setAmt_of_perio_subs_by_indi(String amt_of_perio_subs_by_indi) {
    this.amt_of_perio_subs_by_indi = amt_of_perio_subs_by_indi;
  }

  public String getAmt_of_perio_subs_by_inst() {
    return amt_of_perio_subs_by_inst;
  }

  public void setAmt_of_perio_subs_by_inst(String amt_of_perio_subs_by_inst) {
    this.amt_of_perio_subs_by_inst = amt_of_perio_subs_by_inst;
  }

  public String getPeriod_subupper_amt() {
    return period_subupper_amt;
  }

  public void setPeriod_subupper_amt(String period_subupper_amt) {
    this.period_subupper_amt = period_subupper_amt;
  }

  public String getRedeemfee_backratio() {
    return redeemfee_backratio;
  }

  public void setRedeemfee_backratio(String redeemfee_backratio) {
    this.redeemfee_backratio = redeemfee_backratio;
  }

  public String getCollect_fee_type() {
    return collect_fee_type;
  }

  public void setCollect_fee_type(String collect_fee_type) {
    this.collect_fee_type = collect_fee_type;
  }

  public String getIssue_fee() {
    return issue_fee;
  }

  public void setIssue_fee(String issue_fee) {
    this.issue_fee = issue_fee;
  }

  public String getPerf_roy_type() {
    return perf_roy_type;
  }

  public void setPerf_roy_type(String perf_roy_type) {
    this.perf_roy_type = perf_roy_type;
  }

  public String getPerf_roy_pct() {
    return perf_roy_pct;
  }

  public void setPerf_roy_pct(String perf_roy_pct) {
    this.perf_roy_pct = perf_roy_pct;
  }

  public String getSubscribe_fee() {
    return subscribe_fee;
  }

  public void setSubscribe_fee(String subscribe_fee) {
    this.subscribe_fee = subscribe_fee;
  }

  public String getTran_fee_type() {
    return tran_fee_type;
  }

  public void setTran_fee_type(String tran_fee_type) {
    this.tran_fee_type = tran_fee_type;
  }

  public java.sql.Date getTrade_start_dt() {
    return trade_start_dt;
  }

  public void setTrade_start_dt(java.sql.Date trade_start_dt) {
    this.trade_start_dt = trade_start_dt;
  }

  public java.sql.Date getTrade_end_dt() {
    return trade_end_dt;
  }

  public void setTrade_end_dt(java.sql.Date trade_end_dt) {
    this.trade_end_dt = trade_end_dt;
  }

  public String getFund_level() {
    return fund_level;
  }

  public void setFund_level(String fund_level) {
    this.fund_level = fund_level;
  }

  public String getHold_limit_yn() {
    return hold_limit_yn;
  }

  public void setHold_limit_yn(String hold_limit_yn) {
    this.hold_limit_yn = hold_limit_yn;
  }

  public String getHold_limit() {
    return hold_limit;
  }

  public void setHold_limit(String hold_limit) {
    this.hold_limit = hold_limit;
  }

  public String getHold_limit_type() {
    return hold_limit_type;
  }

  public void setHold_limit_type(String hold_limit_type) {
    this.hold_limit_type = hold_limit_type;
  }

  public String getSubscribe_fee_yn() {
    return subscribe_fee_yn;
  }

  public void setSubscribe_fee_yn(String subscribe_fee_yn) {
    this.subscribe_fee_yn = subscribe_fee_yn;
  }

  public String getBuy_fee_yn() {
    return buy_fee_yn;
  }

  public void setBuy_fee_yn(String buy_fee_yn) {
    this.buy_fee_yn = buy_fee_yn;
  }

  public String getSell_fee_yn() {
    return sell_fee_yn;
  }

  public void setSell_fee_yn(String sell_fee_yn) {
    this.sell_fee_yn = sell_fee_yn;
  }

  public String getTrail_commission() {
    return trail_commission;
  }

  public void setTrail_commission(String trail_commission) {
    this.trail_commission = trail_commission;
  }

  public String getTrail_comm_share_ratio() {
    return trail_comm_share_ratio;
  }

  public void setTrail_comm_share_ratio(String trail_comm_share_ratio) {
    this.trail_comm_share_ratio = trail_comm_share_ratio;
  }

  public String getTradable_yn() {
    return tradable_yn;
  }

  public void setTradable_yn(String tradable_yn) {
    this.tradable_yn = tradable_yn;
  }

  public String getIncome_feature1() {
    return income_feature1;
  }

  public void setIncome_feature1(String income_feature1) {
    this.income_feature1 = income_feature1;
  }

  public String getIncome_feature2() {
    return income_feature2;
  }

  public void setIncome_feature2(String income_feature2) {
    this.income_feature2 = income_feature2;
  }

  public String getSubscribe_fee_discount() {
    return subscribe_fee_discount;
  }

  public void setSubscribe_fee_discount(String subscribe_fee_discount) {
    this.subscribe_fee_discount = subscribe_fee_discount;
  }

  public String getBuy_fee_discount() {
    return buy_fee_discount;
  }

  public void setBuy_fee_discount(String buy_fee_discount) {
    this.buy_fee_discount = buy_fee_discount;
  }

  public String getSell_fee_discount() {
    return sell_fee_discount;
  }

  public void setSell_fee_discount(String sell_fee_discount) {
    this.sell_fee_discount = sell_fee_discount;
  }

  public String getMandator() {
    return mandator;
  }

  public void setMandator(String mandator) {
    this.mandator = mandator;
  }

  public String getBypase_yn() {
    return bypase_yn;
  }

  public void setBypase_yn(String bypase_yn) {
    this.bypase_yn = bypase_yn;
  }

  public String getExpect_rate() {
    return expect_rate;
  }

  public void setExpect_rate(String expect_rate) {
    this.expect_rate = expect_rate;
  }

  public String getExpect_rate_type() {
    return expect_rate_type;
  }

  public void setExpect_rate_type(String expect_rate_type) {
    this.expect_rate_type = expect_rate_type;
  }
}
