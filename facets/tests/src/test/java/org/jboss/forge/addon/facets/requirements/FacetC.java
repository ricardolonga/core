package org.jboss.forge.addon.facets.requirements;

import org.jboss.forge.addon.facets.MockFacet;

public class FacetC extends MockFacet
{
   @Override
   public boolean install()
   {
      return true;
   }

   @Override
   public boolean isInstalled()
   {
      return getFaceted().hasFacet(getClass());
   }

}