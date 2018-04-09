package cn.ac.ucas.demo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person  {
	
	@Id
	@Column(name = "Guid")
	private String guid;
	
	@Column(name = "PYDWM")
	private String pydwm;//单位代码
	
	@Column(name = "PYDW")
	private String pydw;//单位
	
	@Column(name = "XH")
	private String xh;//学号
	
	@Column(name = "Lb")
	private String lb;//类别
	
	@Column(name = "XM")
	private String xm;//姓名
	
	@Column(name = "XMPY")
	private String xmpy;//姓名拼音
	
	@Column(name = "CYM")
	private String cym;//曾用名
	
	@Column(name = "XBM")
	private String xbm;
	
	@Column(name = "XB")
	private String xb;//性别
	
	@Column(name = "CSRQ")
	private Date csrq;//出生日期
	
	//出生地码用于判断新生类别（京外迁入，市内转移，，）
	@Column(name = "CSDM")
	private String csdm;//出生地码
	
	@Column(name = "CSD")
	private String csd;
	
	@Column(name = "SFZH")
	private String sfzh;//身份证号
	
	@Column(name = "QFRQ")
	private Date qfrq;//签发日期
	
	@Column(name = "YXQXM")
	private String yxqxm;
	
	@Column(name = "YXQX")
	private String yxqx;//有效期限
	
	@Column(name = "SLYYM")
	private String slyym;
	
	@Column(name = "SLYY")
	private String slyy;//申领原因
	
	@Column(name = "MZM")
	private String mzm;
	
	@Column(name = "MZ")
	private String mz;//民族
	
	@Column(name = "SYDM")
	private String sydm;
	
	@Column(name = "SYD")
	private String syd;//生源地
	
	@Column(name = "WHCDM")
	private String whcdm;
	
	@Column(name = "WHCD")
	private String whcd;//文化程度
	
	@Column(name = "HYZKM")
	private String hyzkm;
	
	@Column(name = "HYZK")
	private String hyzk;//婚姻状况
	
	@Column(name = "ZYM")
	private String zym;
	
	@Column(name = "ZY")
	private String zy;//职业
	
	@Column(name = "ZYLBM")
	private String zylbm;
	
	@Column(name = "ZYLB")
	private String zylb;//职业类别
	
	@Column(name = "BYQKM")
	private String byqkm;
	
	@Column(name = "BYQK")
	private String byqk;//兵役情况
	
	@Column(name = "XXM")
	private String xxm;
	
	@Column(name = "XX")
	private String xx;//血型
	
	@Column(name = "ZJXYM")
	private String zjxym;
	
	@Column(name = "ZJXY")
	private String zjxy;//宗教信仰
	
	@Column(name = "DJRQ")
	private Date djrq;//登记日期
	
	@Column(name = "SG")
	private String sg;//身高
	
	@Column(name = "JGM")
	private String jgm;
	
	@Column(name = "JG")
	private String jg;//籍贯
	
	@Column(name = "QTZZ")
	private String qtzz;//详址住址
	
	@Column(name = "ZXZTM")
	private String zxztm;
	
	@Column(name = "ZXZT")
	private String zxzt;//学籍状态
	
	@Column(name = "XXNX")
	private String xxnx;//学习年限
	
	@Column(name = "BYRQ")
	private Date byrq;//毕业日期
	
	@Column(name = "BYND")
	private String bynd;//毕业年度
	
	@Column(name = "PQRQ")
	private Date pqrq;//派遣日期
	
	@Column(name = "RXRQ")
	private Date rxrq;//入学日期
	
	@Column(name = "HH")
	private String hh;//户号
	
	@Column(name = "QRZT")
	private String qrzt;//迁入状态
	
	@Column(name = "HKZT")
	private String hkzt;//户口是否在校
	
	@Column(name = "QRLB")
	private String qrlb;//迁入类别
	
	@Column(name = "LZDW")
	private String lzdw;//来自单位
	
	@Column(name = "BH")
	private Integer bh;//户卡编号
	
	@Column(name = "SZTXM")
	private String sztxm;//条形码
	
	@Column(name = "BZ")
	private String bz;//备注
	
	@Column(name = "ZT")
	private Integer zt;
	
	@Column(name = "ZX")
	private Integer zx;//博士照相
	
	@Column(name = "XSXH")
	private String xsxh;//原序号
	
	@Column(name = "GDFS")
	private String gdfs;//攻读方式
	
	@Column(name = "GDZY")
	private String gdzy;//攻读专业
	
	@Column(name = "LXZT")
	private Integer lxzt;//离校状态
	
	@Column(name = "LXFS")
	private String lxfs;//离校方式
	
	@Column(name = "LXRQ")
	private Date lxrq;//离校日期
	
	@Column(name = "AddDate")
	private Date addDate;
	
	@Column(name = "Deleted")
	private Integer deleted;
	
	@Column(name = "Flag")
	private Integer flag;
	
	@Column(name = "YXH")
	private String yxh;//原学号
	
	@Column(name = "YLB")
	private String ylb;//原类别
	
	@Column(name = "YPYDW")
	private String ypydw;//原培养单位
	
	@Column(name = "YPYDWM")
	private String ypydwm;
	
	@Column(name = "LZDWM")
	private String lzdwm;//来自单位码
	
	@Column(name = "SFZSLZT")
	private Integer sfzslzt;
	
	@Column(name = "XTZ")
	private Date xtz;
	
	@Column(name = "ZTB")
	private Date ztb;
	
	@Column(name = "BTL")
	private Date btl;
	
	@Column(name = "Batch")
	private String batch;
	
	@Column(name = "ZP")
	private String zp;//照片
	
	@Column(name = "BDPydw")
	private String bdPydw;
	
	@Column(name = "BDPydwM")
	private String bdPydwm;
	
	@Column(name = "PlqcFlag")
	private Integer plqcFlag;
	
	@Column(name = "Byyx")
	private String byyx;//毕业院系
	
	@Column(name = "Byyxm")
	private String byyxm;
	
	@Column(name = "PLLX")
	private Integer pllx;
	
	@Column(name = "RxxxUser")
	private String rxxxUser;//维护人
	
	@Column(name = "WpdwName")
	private String wpdwName;
	
	@Column(name = "Ysxh")
	private String ysxh;
	
	@Column(name = "PYDWMOld")
	private String pydwmOld;
	
	@Column(name = "PYDWOld")
	private String pydwOld;
	
	@Column(name = "PYDWMNew")
	private String pydwmNew;
	
	@Column(name = "PYDWNew")
	private String pydwNew;
	
	@Column(name = "AddUser")
	private String addUser;//维护人
	
	@Column(name = "YNZBC")
	private String ynzbc;
	
	@Column(name = "BatchMove")
	private Integer batchMove;//转移标志
	
	@Column(name = "XSRemove")
	private Integer xsRemove;
	
	@Column(name = "PaiQian")
	private String paiqian;//是否派遣
	
	@Column(name = "Tiqianpaiqian")
	private Integer tqpq;//是否单独办理，提前派遣
	
	@Column(name = "paiqianyear")
	private Integer pqYear;
	
	@Column(name = "sfdzcg")
	private String sfdzcg;//是否制证成功
	
	@Column(name = "sfts")
	private String sfts;//是否退费
	
	@Column(name = "JieQianHKZT")
	private String jqhkzt;//借前户口状态
	
	@Column(name = "YXDM")
	private String yxdm;//院系代码，从集中教学中同步过来数据
	
	@Column(name = "YXMC")
	private String yxmc;//院系名称，从集中教学中同步过来数据
	
	@Column(name = "SFZFFBZ")
	private String sfzffbz;//身份证发放备注
	
	@Column(name = "QYZZT")
	private String qyzzt;//是否交了迁移证
	
	@Column(name = "HKKZT")
	private String hkkzt;//是否交户口卡
	
	@Column(name = "ZPZT")
	private String zpzt;//是否交照片
	
	@Column(name = "ZWCJZT")
	private String zwcjzt;//是否采集指纹
	
	@Column(name = "SFZSHZT")
	private String sfzshzt;//身份证收费状态
	
	@Column(name = "HJBLBZ")
	private String hjblbz;//户籍办理备注
	
	@Column(name = "HJBH")
	private String hjbh;//户籍编号
	
	@Column(name = "DZYX")
	private String dzyx;//电子邮箱
	
	@Column(name = "QYZBM")
	private String qyzbm;//迁移证编码
	
	@Column(name = "ts")
	private Date ts;
	
	@Column(name = "zfsj")
	private Date zfsj;
	
	@Column(name = "ZXJH")
	private String zxjh;//专项计划
	
	@Column(name = "ZXJHM")
	private String zxjhm;
	
	public String getZxjh() {
		return zxjh;
	}

	public void setZxjh(String zxjh) {
		this.zxjh = zxjh;
	}

	public String getZxjhm() {
		return zxjhm;
	}

	public void setZxjhm(String zxjhm) {
		this.zxjhm = zxjhm;
	}

	public Date getZfsj() {
		return zfsj;
	}

	public void setZfsj(Date zfsj) {
		this.zfsj = zfsj;
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public String getHjbh() {
		return hjbh;
	}

	public void setHjbh(String hjbh) {
		this.hjbh = hjbh;
	}

	public String getDzyx() {
		return dzyx;
	}

	public void setDzyx(String dzyx) {
		this.dzyx = dzyx;
	}

	public String getQyzbm() {
		return qyzbm;
	}

	public void setQyzbm(String qyzbm) {
		this.qyzbm = qyzbm;
	}

	public String getQyzzt() {
		return qyzzt;
	}

	public void setQyzzt(String qyzzt) {
		this.qyzzt = qyzzt;
	}

	public String getHkkzt() {
		return hkkzt;
	}

	public void setHkkzt(String hkkzt) {
		this.hkkzt = hkkzt;
	}

	public String getZpzt() {
		return zpzt;
	}

	public void setZpzt(String zpzt) {
		this.zpzt = zpzt;
	}

	public String getZwcjzt() {
		return zwcjzt;
	}

	public void setZwcjzt(String zwcjzt) {
		this.zwcjzt = zwcjzt;
	}

	public String getSfzshzt() {
		return sfzshzt;
	}

	public void setSfzshzt(String sfzshzt) {
		this.sfzshzt = sfzshzt;
	}

	public String getHjblbz() {
		return hjblbz;
	}

	public void setHjblbz(String hjblbz) {
		this.hjblbz = hjblbz;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPydwm() {
		return pydwm;
	}

	public void setPydwm(String pydwm) {
		this.pydwm = pydwm;
	}

	public String getPydw() {
		return pydw;
	}

	public void setPydw(String pydw) {
		this.pydw = pydw;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getLb() {
		return lb;
	}

	public void setLb(String lb) {
		this.lb = lb;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXmpy() {
		return xmpy;
	}

	public void setXmpy(String xmpy) {
		this.xmpy = xmpy;
	}

	public String getCym() {
		return cym;
	}

	public void setCym(String cym) {
		this.cym = cym;
	}

	public String getXbm() {
		return xbm;
	}

	public void setXbm(String xbm) {
		this.xbm = xbm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public Date getCsrq() {
		return csrq;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}

	public String getCsdm() {
		return csdm;
	}

	public void setCsdm(String csdm) {
		this.csdm = csdm;
	}

	public String getCsd() {
		return csd;
	}

	public void setCsd(String csd) {
		this.csd = csd;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public Date getQfrq() {
		return qfrq;
	}

	public void setQfrq(Date qfrq) {
		this.qfrq = qfrq;
	}

	public String getYxqxm() {
		return yxqxm;
	}

	public void setYxqxm(String yxqxm) {
		this.yxqxm = yxqxm;
	}

	public String getYxqx() {
		return yxqx;
	}

	public void setYxqx(String yxqx) {
		this.yxqx = yxqx;
	}

	public String getSlyym() {
		return slyym;
	}

	public void setSlyym(String slyym) {
		this.slyym = slyym;
	}

	public String getSlyy() {
		return slyy;
	}

	public void setSlyy(String slyy) {
		this.slyy = slyy;
	}

	public String getMzm() {
		return mzm;
	}

	public void setMzm(String mzm) {
		this.mzm = mzm;
	}

	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}

	public String getSydm() {
		return sydm;
	}

	public void setSydm(String sydm) {
		this.sydm = sydm;
	}

	public String getSyd() {
		return syd;
	}

	public void setSyd(String syd) {
		this.syd = syd;
	}

	public String getWhcdm() {
		return whcdm;
	}

	public void setWhcdm(String whcdm) {
		this.whcdm = whcdm;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getHyzkm() {
		return hyzkm;
	}

	public void setHyzkm(String hyzkm) {
		this.hyzkm = hyzkm;
	}

	public String getHyzk() {
		return hyzk;
	}

	public void setHyzk(String hyzk) {
		this.hyzk = hyzk;
	}

	public String getZym() {
		return zym;
	}

	public void setZym(String zym) {
		this.zym = zym;
	}

	public String getZy() {
		return zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

	public String getZylbm() {
		return zylbm;
	}

	public void setZylbm(String zylbm) {
		this.zylbm = zylbm;
	}

	public String getZylb() {
		return zylb;
	}

	public void setZylb(String zylb) {
		this.zylb = zylb;
	}

	public String getByqkm() {
		return byqkm;
	}

	public void setByqkm(String byqkm) {
		this.byqkm = byqkm;
	}

	public String getByqk() {
		return byqk;
	}

	public void setByqk(String byqk) {
		this.byqk = byqk;
	}

	public String getXxm() {
		return xxm;
	}

	public void setXxm(String xxm) {
		this.xxm = xxm;
	}

	public String getXx() {
		return xx;
	}

	public void setXx(String xx) {
		this.xx = xx;
	}

	public String getZjxym() {
		return zjxym;
	}

	public void setZjxym(String zjxym) {
		this.zjxym = zjxym;
	}

	public String getZjxy() {
		return zjxy;
	}

	public void setZjxy(String zjxy) {
		this.zjxy = zjxy;
	}

	public Date getDjrq() {
		return djrq;
	}

	public void setDjrq(Date djrq) {
		this.djrq = djrq;
	}

	public String getSg() {
		return sg;
	}

	public void setSg(String sg) {
		this.sg = sg;
	}

	public String getJgm() {
		return jgm;
	}

	public void setJgm(String jgm) {
			this.jgm = jgm;
		
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public String getQtzz() {
		return qtzz;
	}

	public void setQtzz(String qtzz) {
		this.qtzz = qtzz;
	}

	public String getZxztm() {
		return zxztm;
	}

	public void setZxztm(String zxztm) {
		this.zxztm = zxztm;
	}

	public String getZxzt() {
		return zxzt;
	}

	public void setZxzt(String zxzt) {
		this.zxzt = zxzt;
	}

	public String getXxnx() {
		return xxnx;
	}

	public void setXxnx(String xxnx) {
		this.xxnx = xxnx;
	}

	public Date getByrq() {
		return byrq;
	}

	public void setByrq(Date byrq) {
		this.byrq = byrq;
	}

	public String getBynd() {
		return bynd;
	}

	public void setBynd(String bynd) {
		this.bynd = bynd;
	}

	public Date getPqrq() {
		return pqrq;
	}

	public void setPqrq(Date pqrq) {
		this.pqrq = pqrq;
	}

	public Date getRxrq() {
		return rxrq;
	}

	public void setRxrq(Date rxrq) {
		this.rxrq = rxrq;
	}

	public String getHh() {
		return hh;
	}

	public void setHh(String hh) {
		this.hh = hh;
	}

	public String getQrzt() {
		return qrzt;
	}

	public void setQrzt(String qrzt) {
		this.qrzt = qrzt;
	}

	public String getHkzt() {
		return hkzt;
	}

	public void setHkzt(String hkzt) {
		this.hkzt = hkzt;
	}

	public String getQrlb() {
		return qrlb;
	}

	public void setQrlb(String qrlb) {
		this.qrlb = qrlb;
	}

	public String getLzdw() {
		return lzdw;
	}

	public void setLzdw(String lzdw) {
		this.lzdw = lzdw;
	}

	public Integer getBh() {
		return bh;
	}

	public void setBh(Integer bh) {
		this.bh = bh;
	}

	public String getSztxm() {
		return sztxm;
	}

	public void setSztxm(String sztxm) {
		this.sztxm = sztxm;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Integer getZt() {
		return zt;
	}

	public void setZt(Integer zt) {
		this.zt = zt;
	}

	public Integer getZx() {
		return zx;
	}

	public void setZx(Integer zx) {
		this.zx = zx;
	}

	public String getXsxh() {
		return xsxh;
	}

	public void setXsxh(String xsxh) {
		this.xsxh = xsxh;
	}

	public String getGdfs() {
		return gdfs;
	}

	public void setGdfs(String gdfs) {
		this.gdfs = gdfs;
	}

	public String getGdzy() {
		return gdzy;
	}

	public void setGdzy(String gdzy) {
		this.gdzy = gdzy;
	}

	public Integer getLxzt() {
		return lxzt;
	}

	public void setLxzt(Integer lxzt) {
		this.lxzt = lxzt;
	}

	public String getLxfs() {
		return lxfs;
	}

	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
	}

	public Date getLxrq() {
		return lxrq;
	}

	public void setLxrq(Date lxrq) {
		this.lxrq = lxrq;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getYxh() {
		return yxh;
	}

	public void setYxh(String yxh) {
		this.yxh = yxh;
	}

	public String getYlb() {
		return ylb;
	}

	public void setYlb(String ylb) {
		this.ylb = ylb;
	}

	public String getYpydw() {
		return ypydw;
	}

	public void setYpydw(String ypydw) {
		this.ypydw = ypydw;
	}

	public String getYpydwm() {
		return ypydwm;
	}

	public void setYpydwm(String ypydwm) {
		this.ypydwm = ypydwm;
	}

	public String getLzdwm() {
		return lzdwm;
	}

	public void setLzdwm(String lzdwm) {
		this.lzdwm = lzdwm;
	}

	public Integer getSfzslzt() {
		return sfzslzt;
	}

	public void setSfzslzt(Integer sfzslzt) {
		this.sfzslzt = sfzslzt;
	}

	public Date getXtz() {
		return xtz;
	}

	public void setXtz(Date xtz) {
		this.xtz = xtz;
	}

	public Date getZtb() {
		return ztb;
	}

	public void setZtb(Date ztb) {
		this.ztb = ztb;
	}

	public Date getBtl() {
		return btl;
	}

	public void setBtl(Date btl) {
		this.btl = btl;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getZp() {
		return zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

	public String getBdPydw() {
		return bdPydw;
	}

	public void setBdPydw(String bdPydw) {
		this.bdPydw = bdPydw;
	}

	public String getBdPydwm() {
		return bdPydwm;
	}

	public void setBdPydwm(String bdPydwm) {
		this.bdPydwm = bdPydwm;
	}

	public Integer getPlqcFlag() {
		return plqcFlag;
	}

	public void setPlqcFlag(Integer plqcFlag) {
		this.plqcFlag = plqcFlag;
	}

	public String getByyx() {
		return byyx;
	}

	public void setByyx(String byyx) {
		this.byyx = byyx;
	}

	public String getByyxm() {
		return byyxm;
	}

	public void setByyxm(String byyxm) {
		this.byyxm = byyxm;
	}

	public Integer getPllx() {
		return pllx;
	}

	public void setPllx(Integer pllx) {
		this.pllx = pllx;
	}

	public String getRxxxUser() {
		return rxxxUser;
	}

	public void setRxxxUser(String rxxxUser) {
		this.rxxxUser = rxxxUser;
	}

	public String getWpdwName() {
		return wpdwName;
	}

	public void setWpdwName(String wpdwName) {
		this.wpdwName = wpdwName;
	}

	public String getYsxh() {
		return ysxh;
	}

	public void setYsxh(String ysxh) {
		this.ysxh = ysxh;
	}

	public String getPydwmOld() {
		return pydwmOld;
	}

	public void setPydwmOld(String pydwmOld) {
		this.pydwmOld = pydwmOld;
	}

	public String getPydwOld() {
		return pydwOld;
	}

	public void setPydwOld(String pydwOld) {
		this.pydwOld = pydwOld;
	}

	public String getPydwmNew() {
		return pydwmNew;
	}

	public void setPydwmNew(String pydwmNew) {
		this.pydwmNew = pydwmNew;
	}

	public String getPydwNew() {
		return pydwNew;
	}

	public void setPydwNew(String pydwNew) {
		this.pydwNew = pydwNew;
	}

	public String getAddUser() {
		return addUser;
	}

	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	public String getYnzbc() {
		return ynzbc;
	}

	public void setYnzbc(String ynzbc) {
		this.ynzbc = ynzbc;
	}

	public Integer getBatchMove() {
		return batchMove;
	}

	public void setBatchMove(Integer batchMove) {
		this.batchMove = batchMove;
	}

	public Integer getXsRemove() {
		return xsRemove;
	}

	public void setXsRemove(Integer xsRemove) {
		this.xsRemove = xsRemove;
	}

	public String getPaiqian() {
		return paiqian;
	}

	public void setPaiqian(String paiqian) {
		this.paiqian = paiqian;
	}

	public Integer getTqpq() {
		return tqpq;
	}

	public void setTqpq(Integer tqpq) {
		this.tqpq = tqpq;
	}

	public Integer getPqYear() {
		return pqYear;
	}

	public void setPqYear(Integer pqYear) {
		this.pqYear = pqYear;
	}

	public String getSfdzcg() {
		return sfdzcg;
	}

	public void setSfdzcg(String sfdzcg) {
		this.sfdzcg = sfdzcg;
	}

	public String getSfts() {
		return sfts;
	}

	public void setSfts(String sfts) {
		this.sfts = sfts;
	}

	public String getJqhkzt() {
		return jqhkzt;
	}

	public void setJqhkzt(String jqhkzt) {
		this.jqhkzt = jqhkzt;
	}

	public String getYxdm() {
		return yxdm;
	}

	public void setYxdm(String yxdm) {
		this.yxdm = yxdm;
	}

	public String getYxmc() {
		return yxmc;
	}

	public void setYxmc(String yxmc) {
		this.yxmc = yxmc;
	}

	public String getSfzffbz() {
		return sfzffbz;
	}

	public void setSfzffbz(String sfzffbz) {
		this.sfzffbz = sfzffbz;
	}
}