package cct.service.impl;

import java.util.List;

import cct.dao.groupstageDAOImpl;
import cct.entity.groupstage;
import cct.service.groupstageService;

public class groupstageServiceImpl implements groupstageService{
	private groupstageDAOImpl groupstageDAOImpl;
	@Override
	public boolean addGroupstage(groupstage groupstage) {
		// TODO Auto-generated method stub
		try {
			groupstageDAOImpl.begin();
			if(groupstageDAOImpl.findById(groupstage.getGroupStageId())!=null)
			{
				groupstageDAOImpl.finish();
				return false;
			}
			groupstageDAOImpl.save(groupstage);
			groupstageDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(groupstageDAOImpl.getTx()!=null)
			{
				groupstageDAOImpl.rollBack();
			}
			return false;
		}
		return true;
	}
	@Override
	public boolean deleteGroupstage(String groupStageId) {
		// TODO Auto-generated method stub
		try {
			groupstageDAOImpl.begin();
			groupstage groupstage=groupstageDAOImpl.findById(groupStageId);
			groupstageDAOImpl.delete(groupstage);
			groupstageDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(groupstageDAOImpl.getTx()!=null)
			{
				groupstageDAOImpl.rollBack();
			}
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * ÐÞ¸Ä½×¶ÎÐÅÏ¢
	 * @see cct.service.groupstageService#alterGroupstage(cct.entity.groupstage)
	 */
	@Override
	public boolean alterGroupstage(groupstage groupstage) {
		// TODO Auto-generated method stub
		try {
			groupstageDAOImpl.begin();
			groupstage groupstage2=null;
			groupstage2=groupstageDAOImpl.findById(groupstage.getGroupStageId());
			groupstage2.setEndTime(groupstage.getEndTime());
			groupstage2.setGoal(groupstage.getGoal());
			groupstage2.setGroupId(groupstage.getGroupId());
			groupstage2.setStageName(groupstage.getStageName());
			groupstage2.setStartTime(groupstage.getStartTime());
			groupstage2.setState(groupstage.getState());
			groupstageDAOImpl.update(groupstage2);
			groupstageDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(groupstageDAOImpl.getTx()!=null)
			{
				groupstageDAOImpl.rollBack();
			}
			return false;
		}
		return true;
	}
	@Override
	public List<groupstage> getAllGroupstage(String groupId) {
		// TODO Auto-generated method stub
		List<groupstage> list=null;
		try {
			groupstageDAOImpl.begin();
			list=groupstageDAOImpl.findByQuery("from groupstage where groupId='"+groupId+"'");
			groupstageDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	public groupstageDAOImpl getGroupstageDAOImpl() {
		return groupstageDAOImpl;
	}
	public void setGroupstageDAOImpl(groupstageDAOImpl groupstageDAOImpl) {
		this.groupstageDAOImpl = groupstageDAOImpl;
	}

}
