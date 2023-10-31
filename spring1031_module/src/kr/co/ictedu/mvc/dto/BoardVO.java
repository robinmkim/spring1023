package kr.co.ictedu.mvc.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int num;
	private String title;
	private String writer;
	private String content;
	private int hit ;
	private String reip;
	private String bdate;
	private List<MultipartFile> mflist;
	private MultipartFile vfile;
	private String iname;
	private int cnt;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
		System.out.println("title");
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
		System.out.println("writer");
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		System.out.println("content");
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
		System.out.println("hit");
	}
	public String getReip() {
		return reip;
	}
	public void setReip(String reip) {
		this.reip = reip;
		System.out.println("reip");
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
		System.out.println("bdate");
	}
	public List<MultipartFile> getMflist() {
		return mflist;
	}
	public void setMflist(List<MultipartFile> mflist) {
		this.mflist = mflist;
		System.out.println("mflist");
	}
	public MultipartFile getVfile() {
		return vfile;
	}
	public void setVfile(MultipartFile vfile) {
		System.out.println("vfile");
		this.vfile = vfile;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", writer=" + writer + ", content=" + content + ", hit=" + hit + ", reip="
				+ reip + ", bdate=" + bdate + ", mflist=" + mflist + ", vfile=" + vfile + "]";
	}
	
	
}
