package org.omg.bpmn.miwg.xpath.checks;

import org.omg.bpmn.miwg.xpath.common.AbstractXpathCheck;

public class A_1_0_Check extends AbstractXpathCheck {

	@Override
	public String getName() {
		return "A.1.0";
	}

	@Override
	protected void doExecute() throws Throwable {
		selectElementX("/bpmn:definitions/bpmn:process");

		navigateElement("bpmn:startEvent", "Start Event");

		navigateFollowingElement("bpmn:task", "Task 1");

		navigateFollowingElement("bpmn:task", "Task 2");

		navigateFollowingElement("bpmn:task", "Task 3");

		navigateFollowingElement("bpmn:endEvent", "End Event");

		pop();
	}

}
