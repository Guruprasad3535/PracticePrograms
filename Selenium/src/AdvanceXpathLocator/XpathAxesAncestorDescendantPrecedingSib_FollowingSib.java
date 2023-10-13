package AdvanceXpathLocator;

public class XpathAxesAncestorDescendantPrecedingSib_FollowingSib {
	
 /*Ancestor and Descendant
  * 
  * Traversing from iphone to its price
  *   
  *   //span[text()='Apple iPhone 12, 64GB, Green - Fully Unlocked (Renewed)']
  *   /ancestor::div[@data-index='2']
  *   /descendant::span[@class='a-price-whole']
  */
	
 /*Preceding-Sibling and Following-Sibling
  * 
  * Traversing from iphone node to its parent and traversing between there siblings
  * 
  * //span[text()='Apple iPhone 12, 64GB, Green - Fully Unlocked (Renewed)']
  * /ancestor::div[contains(@class,'a-section a-spacing-none')]
  * /following-sibling::div[@class='sg-row']
  * /preceding-sibling::div[1]
  * 
  */

}
