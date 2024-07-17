package kr.or.oho.mapper;

import java.util.List;

import kr.or.oho.vo.ComentVO;
import kr.or.oho.vo.FreeBbsVO;

public interface FreeBbsMapper {

	public List<FreeBbsVO> list();

	public FreeBbsVO detail(String fbNo);
	
	void count(String fbNo);

	public int create(FreeBbsVO freeBbsVO);

	public int update(FreeBbsVO freeBbsVO);

	public void delete(String fbNo);
	
	public List<ComentVO> comentList(String fbNo);

	public int createCmt(ComentVO comentVO);

	public int deleteCmt(ComentVO comentVO);

	public int updateCmt(ComentVO comentVO);

	public List<FreeBbsVO> empBoardList();

}