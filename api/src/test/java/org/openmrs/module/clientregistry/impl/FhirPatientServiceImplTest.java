package org.openmrs.module.clientregistry.impl;

import org.junit.Before;
import org.openmrs.api.ConceptService;
import org.openmrs.api.EncounterService;
import org.openmrs.api.ObsService;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;

/**
 * @author smallGod
 */
public class FhirPatientServiceImplTest extends BaseModuleContextSensitiveTest {
	
	@Autowired
	private EncounterService encounterService;
	
	@Autowired
	private ConceptService conceptService;
	
	@Autowired
	private ObsService obsService;
	
	private Method methodInvoked;
	
	@Before
	public void initialiseCommonTestData() throws ClassNotFoundException, NoSuchMethodException {
		
		//executeDataSet(OHRI_INIT_XML_TEST_DATASET_PATH);
		
		//Class encounterServiceImplClass = Class.forName("org.openmrs.api.impl.EncounterServiceImpl");
		//methodInvoked = encounterServiceImplClass.getDeclaredMethod(ConceptComputeTrigger.SAVE_ENCOUNTER, Encounter.class);
	}
}
