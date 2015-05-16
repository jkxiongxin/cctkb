package cct.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.AbstractTransactionalSpringContextTests;

import cct.entity.groupstage;
import cct.service.groupstageService;

/**
 * @author 熊鑫
 * @createDate 2015/5/2
 * @version 1.0
 * @description groupstageService的测试类
 *
 */
/**
 * @author Administrator
 *
 */
public class groupstageServiceTest extends
		AbstractTransactionalSpringContextTests {
	private groupstageService groupstageService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testAddGroupstage() {
//		groupstage groupstage=new groupstage();
//		groupstage.setStageName("设计阶段");
//		groupstage.setGoal("设计出比较完善的数据库和较为详尽的功能需求");
//		groupstage.setGroupId("2015_1");
//		groupstage.setGroupStageId("2015_1_1");
//		groupstage.setState(0);
//		groupstage.setStartTime("2015-5-2");
//		groupstage.setEndTime("2015-6-2");
//		if(groupstageService.addGroupstage(groupstage))
//		{
//			System.out.print("添加成功");
//		}
//		else {
//			System.out.print("该阶段已存在");
//		}
		fail("Not yet implemented");
	}
	public String[] getConfigLocations() {
	    String[] configLocations = { "file:src/applicationContext.xml"};
	    return configLocations;
	}
	@Test
	public void testDeleteGroupstage() {
//		groupstage groupstage=new groupstage();
//		groupstage.setStageName("设计阶段");
//		groupstage.setGoal("设计出比较完善的数据库和较为详尽的功能需求");
//		groupstage.setGroupId("2015_1");
//		groupstage.setGroupStageId("2015_1_1");
//		groupstage.setState(0);
//		groupstage.setStartTime("2015-5-2");
//		groupstage.setEndTime("2015-6-2");
//		if(groupstageService.deleteGroupstage(groupstage.getGroupStageId()))
//		{
//			System.out.print("删除成功");
//		}
//		else {
//			System.out.print("删除失败");
//		}
		fail("Not yet implemented");
	}

	@Test
	public void testAlterGroupstage() {
		groupstage groupstage=new groupstage();
		groupstage.setStageName("设计阶段");
		groupstage.setGoal("设计出比较完善的数据库和较为详尽的功能需求");
		groupstage.setGroupId("2015_1");
		groupstage.setGroupStageId("2015_1_1");
		groupstage.setState(0);
		groupstage.setStartTime("2015-5-2");
		groupstage.setEndTime("2015-6-3");
		if(groupstageService.alterGroupstage(groupstage))
		{
			System.out.print("修改成功");
		}
		else {
			System.out.print("修改失败");
		}
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllGroupstage() {
		fail("Not yet implemented");
	}

	public groupstageService getGroupstageService() {
		return groupstageService;
	}

	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}
	
}
