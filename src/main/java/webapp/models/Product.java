package webapp.models;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.google.gson.annotations.SerializedName;


// Entity for create object from json

@Entity
@Table(name="products")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean isDeleted;
	private int osId;
	private int averageRateIndex;
	private String bulk; 
	private int number_installs;
	private String downLoadLink;
	private String iconThumbNail;
	private int osTypeId;
	private String osTypeName;
	private String appCategoryName;
	private String appCategoryID;
	@ElementCollection
	private List<String> permissionDetails;
	@OneToOne(targetEntity=CreationDateTime.class,cascade=CascadeType.ALL)  
	private CreationDateTime creationDateTime;
	private long fileSize;
	private String developer;
	private String versionCode;
	private String versionName;
	private String publishState;
	private String minSDK;
	private String targetSDK;
	@SerializedName(value = "deleted")
	private boolean deletedSecond;
	@OneToOne(targetEntity=CreationDateTime.class,cascade=CascadeType.ALL)  
	private CreationDateTime lastModifyDate;
	private String title;
	private String shortDescription;
	private String icon;
	private String osName;
	@ElementCollection
	private List<String> keyword;
	 
	private int id;
	private String packageName;
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int table_Id;
	
	public Product() {
		
	}
	
	
	




	public boolean isDeletedSecond(){
		
		return this.deletedSecond;
	}
	
	public boolean setDeletedSecond(boolean deleted){
		
		return this.deletedSecond = deleted;
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getOsId() {
		return osId;
	}
	public void setOsId(int osId) {
		this.osId = osId;
	}
	public int getAverageRateIndex() {
		return averageRateIndex;
	}
	public void setAverageRateIndex(int averageRateIndex) {
		this.averageRateIndex = averageRateIndex;
	}
	public Object getBulk() {
		return bulk;
	}
	public void setBulk(String bulk) {
		this.bulk = bulk;
	}
	public int getNumber_installs() {
		return number_installs;
	}
	public void setNumber_installs(int number_installs) {
		this.number_installs = number_installs;
	}
	public String getDownLoadLink() {
		return downLoadLink;
	}
	public void setDownLoadLink(String downLoadLink) {
		this.downLoadLink = downLoadLink;
	}
	public String getIconThumbNail() {
		return iconThumbNail;
	}
	public void setIconThumbNail(String iconThumbNail) {
		this.iconThumbNail = iconThumbNail;
	}
	public int getOsTypeId() {
		return osTypeId;
	}
	public void setOsTypeId(int osTypeId) {
		this.osTypeId = osTypeId;
	}
	public String getOsTypeName() {
		return osTypeName;
	}
	public void setOsTypeName(String osTypeName) {
		this.osTypeName = osTypeName;
	}
	public String getAppCategoryName() {
		return appCategoryName;
	}
	public void setAppCategoryName(String appCategoryName) {
		this.appCategoryName = appCategoryName;
	}
	public String getAppCategoryID() {
		return appCategoryID;
	}
	public void setAppCategoryID(String appCategoryID) {
		this.appCategoryID = appCategoryID;
	}
	public List<String> getPermissionDetails() {
		return permissionDetails;
	}
	public void setPermissionDetails(List<String> permissionDetails) {
		this.permissionDetails = permissionDetails;
	}
	public CreationDateTime getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(CreationDateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getPublishState() {
		return publishState;
	}
	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}
	public String getMinSDK() {
		return minSDK;
	}
	public void setMinSDK(String minSDK) {
		this.minSDK = minSDK;
	}
	public String getTargetSDK() {
		return targetSDK;
	}
	public void setTargetSDK(String targetSDK) {
		this.targetSDK = targetSDK;
	}

	public CreationDateTime getLastModifyDate() {
		return lastModifyDate;
	}
	public void setLastModifyDate(CreationDateTime lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public List<String> getKeyword() {
		return keyword;
	}
	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	
	private String toString(List<String> list) {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(Iterator<String> iterator=list.iterator();iterator.hasNext();) {
			
			sb.append(iterator.next()+",");
		}
		
		String str = sb.toString().substring(0, sb.length()-1);
		return str+"]";
	}
	
	
	@Override
	public String toString() {
		 String string ="[isDeleted=" + isDeleted + ", osId=" + osId + ", averageRateIndex=" + averageRateIndex
				+ ", bulk=" + bulk + ", number_installs=" + number_installs + ", downLoadLink=" + downLoadLink
				+ ", iconThumbNail=" + iconThumbNail + ", osTypeId=" + osTypeId + ", osTypeName=" + osTypeName
				+ ", appCategoryName=" + appCategoryName + ", appCategoryID=" + appCategoryID  ;
		 		String string2 = ", permissionDetails="
				+ this.toString(permissionDetails) + ", creationDateTime=" + creationDateTime.toString() + ", fileSize=" + fileSize
				+ ", developer=" + developer + ", versionCode=" + versionCode + ", versionName=" + versionName
				+ ", publishState=" + publishState + ", minSDK=" + minSDK + ", targetSDK=" + targetSDK
				+ ", deletedSecond=" + deletedSecond + ", lastModifyDate=" + lastModifyDate.toString() + ", title=" + title
				+ ", shortDescription=" + shortDescription + ", icon=" + icon + ", osName=" + osName + ", keyword="
				+ this.toString(keyword) + ", id=" + id + ", packageName=" + packageName + "]";
		 
		 return string + string2;
	}


}
