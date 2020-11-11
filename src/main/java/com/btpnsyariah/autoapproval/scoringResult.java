package com.btpnsyariah.autoapproval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class scoringResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String scoringRule;

	private java.lang.String param;

	private java.lang.String value;

	private java.lang.String result;

	private java.lang.String rejectCode;

	private java.lang.String rejectDesc;
	
	private java.util.HashMap<String,String> rejectDescMap = new java.util.HashMap<String,String>();

	private java.lang.String deviationCode;

	private java.lang.String deviationDesc;
	
	private java.util.HashMap<String,String> deviationDescMap = new java.util.HashMap<String,String>();

	public void init() {
	    this.rejectDescMap.put("001", "Usia tidak sesuai");
        this.rejectDescMap.put("002", "Plafond tidak sesuai / tidak ada informasi usaha");
        this.rejectDescMap.put("003", "Di bawah angsuran ke 12");
        this.rejectDescMap.put("004", "Penggunaan Uang solidaritas melebihi ketentuan");
        this.rejectDescMap.put("005", "Jumlah Mangkir melebihi ketentuan");
        this.rejectDescMap.put("006", "Tidak ada usaha");
        this.rejectDescMap.put("007", "Plafond melebihi ketentuan");
        this.rejectDescMap.put("008", "Tenor tidak sesuai ketentuan");
        this.rejectDescMap.put("009", "Saldo tabungan tidak mencukupi");
        this.rejectDescMap.put("010", "Angsuran terakhir dari pembiayaan berjalan belum terbayar");
        this.rejectDescMap.put("011", "Percepatan pencairan / tidak sesuai jadwal PRS");
        this.rejectDescMap.put("012", "Pembiayaan sebelumnya menunggak / over tenor");
        this.rejectDescMap.put("013", "Belum memiliki tabungan dengan status pending");
        this.rejectDescMap.put("014", "Kategori Nasabah = D");
        this.rejectDescMap.put("015", "Terdapat kesamaan data dengan CIF [ccc] di wisma [www], pastikan apakah nasabah yg sama. Pastikan input data KTP dan nama ibu kandung dengan benar atau ajukan kembali dengan CIF [ccc]");
        this.rejectDescMap.put("016", "Nasabah masih memiliki pembiayaan yang sama dengan status aktif");
        this.rejectDescMap.put("017", "Terdapat pengajuan berstatus disetujui / menunggu persetujuan atas nasabah ini");
        this.rejectDescMap.put("018", "Nasabah masih belum DO");
        this.rejectDescMap.put("019", "Salah kode PMD");
        this.rejectDescMap.put("020", "Limit pengguna tidak mencukupi");
        this.rejectDescMap.put("021", "Nasabah tidak punya usaha, Plafon tidak sesuai");
        this.rejectDescMap.put("022", "Nasabah tidak punya PMD lanjutan yang aktif");
        this.rejectDescMap.put("023", "Kode produk hanya boleh diajukan sekali saja");
        this.rejectDescMap.put("024", "nasabah hanya boleh mengajukan 1 appid baru per hari");
        this.rejectDescMap.put("025", "Terdapat pembiayaan aktif yang belum lunas");
        this.rejectDescMap.put("026", "Nasabah tidak punya PMD awal yang aktif");
        this.rejectDescMap.put("027", "Terjadi perubahan data oleh MMS / KFO ketika diproses oleh NOS Engine. Ajukan kembali besok.");
        this.rejectDescMap.put("028", "APPID sudah pernah 2x autoreject");
        this.rejectDescMap.put("029", "Tidak ada histori pembiayaan sebelumnya");
        this.rejectDescMap.put("030", "Tanggal rencana cair tidak sesuai jadwal PRS");
        this.rejectDescMap.put("031", "Nasabah tidak punya Mapan Syariah / PMD Lanjutan Khusus yang aktif");
        this.rejectDescMap.put("032", "Nasabah tidak punya PMD Reguler / Mapan Syariah / PMD Lanjutan Khusus yang aktif");
        this.rejectDescMap.put("033", "Jumlah siklus sebelumnya tidak sesuai");
        this.rejectDescMap.put("034", "Nasabah DO tidak diperbolehkan mengajukan pembiayaan lanjutan");
        this.rejectDescMap.put("035", "MMS tidak termasuk dalam list MMS piloting produk");
        this.rejectDescMap.put("036", "Nasabah memiliki history pernah menunggak");
        this.rejectDescMap.put("037", "Plafond pembiayaan berjalan tidak sesuai");
        this.rejectDescMap.put("038", "Sisa PRS berjalan kurang dari 11 PRS");
        this.rejectDescMap.put("039", "PRO - double APPID");
	    
	    this.deviationDescMap.put("D01", "plafon");
	    this.deviationDescMap.put("D02", "mangkir");
	    this.deviationDescMap.put("D03", "nasabah 1 rumah dengan nasabah lain");
	    this.deviationDescMap.put("D04", "percepatan pencairan");
        this.deviationDescMap.put("D07", "nasabah pernah menunggak");
	}

	public java.lang.String getScoringRule() {
		return this.scoringRule;
	}

	public void setScoringRule(java.lang.String scoringRule) {
		this.scoringRule = scoringRule;
	}

	public java.lang.String getParam() {
		return this.param;
	}

	public void setParam(java.lang.String param) {
		this.param = param;
	}

	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public java.lang.String getResult() {
		return this.result;
	}

	public void setResult(java.lang.String result) {
		this.result = result;
	}

	public java.lang.String getRejectCode() {
		return this.rejectCode;
	}

	public void setRejectCode(java.lang.String rejectCode) {
		this.rejectCode = rejectCode;
		setRejectDesc(rejectCode);
	}

	public java.lang.String getRejectDesc() {
		return this.rejectDesc;
	}

	public void setRejectDesc(java.lang.String rejectCode) {
		this.rejectDesc = this.rejectDescMap.get(rejectCode);
	}

	public java.lang.String getDeviationCode() {
		return this.deviationCode;
	}

	public void setDeviationCode(java.lang.String deviationCode) {
		this.deviationCode = deviationCode;
		setDeviationDesc(deviationCode);
	}

	public java.lang.String getDeviationDesc() {
		return this.deviationDesc;
	}

	public void setDeviationDesc(java.lang.String deviationCode) {
		this.deviationDesc = this.deviationDescMap.get(deviationCode);
	}
	
	@Override
    public String toString() {
        return "{scoringRule:" + scoringRule + ", " +
            "param:" + param + ", " +
            "value:" + value + ", " +
            "result:" + result + ", " +
            "rejectCode:" + rejectCode + ", " +
            "rejectDesc:" + rejectDesc + ", " +
            "deviationCode:" + deviationCode + ", " +
            "deviationDesc:" + deviationDesc +
            "}";
        
    }

	public scoringResult() {
	    init();
	}

	public scoringResult(java.lang.String scoringRule, java.lang.String param,
			java.lang.String value, java.lang.String result,
			java.lang.String rejectCode,
			java.lang.String deviationCode) {
	    init();
		this.scoringRule = scoringRule;
		this.param = param;
		this.value = value;
		this.result = result;
		this.rejectCode = rejectCode;
		this.rejectDesc = rejectDesc;
		this.deviationCode = deviationCode;
		this.deviationDesc = deviationDesc;
	}

}