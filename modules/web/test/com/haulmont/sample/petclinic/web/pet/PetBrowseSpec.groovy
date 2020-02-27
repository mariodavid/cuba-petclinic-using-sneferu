package com.haulmont.sample.petclinic.web.pet

import com.haulmont.sample.petclinic.entity.pet.Pet
import com.haulmont.sample.petclinic.web.PetclinicWebIntegrationSpec
import com.haulmont.sample.petclinic.web.pet.pet.PetBrowse
import com.haulmont.sneferu.screen.StandardLookupTestAPI

import static com.haulmont.sneferu.ComponentDescriptors.button
import static com.haulmont.sneferu.Interactions.click

class PetBrowseSpec extends PetclinicWebIntegrationSpec {

  StandardLookupTestAPI<Pet, PetBrowse> petBrowse


  def "the Discount for a Pet can be displayed via the Pet Browse Screen"() {

    given:
    petBrowse = uiTestAPI.openStandardLookup(Pet, PetBrowse)

    when:
    petBrowse.interact(click(button("calculateDiscountBtn")))

    then:
    uiTestAPI.isActive(petBrowse)
  }

}