public class RevisedHistoricalEvent extends HistoricalEvent{
    public static final String DEFAULT_REVISED_DESCRIPTION = "description";
    public static final String DEFAULT_CITATION = "citation";
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent() {
        this.revisedDescription = DEFAULT_DESCRIPTION;
        this.citation = DEFAULT_CITATION;
    }

    public RevisedHistoricalEvent(String description, Date day, String _revisedDescription, String _citation) {
        super(description, day);
        this.revisedDescription = _revisedDescription;
        this.citation = _citation;
    }
    @Override
    public String toString(){
        return String.format("Revised Description: %s\nDate: %s",this.revisedDescription,this.citation);
    }

    public void setRevisedDescription(String _revisedDescription) {
        this.revisedDescription = _revisedDescription;
    }
    public void setCitation(String _citation) {
        this.citation = _citation;
    }

    public String getRevisedDesciption() {
        return (this.revisedDescription);
    }
    public String getCitation() {
        return (this.citation);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        else if(this.getClass() != other.getClass())
        {
            return false;
        }
        RevisedHistoricalEvent otherRevisedHistoricalEvent = (RevisedHistoricalEvent) other;
        return super.equals(otherRevisedHistoricalEvent)
                && this.revisedDescription==(otherRevisedHistoricalEvent.revisedDescription)
                && this.citation.equals(otherRevisedHistoricalEvent.citation);
    }

    public String teach() {
        return String.format(
                "The following  \"history\" was told for many years:\n\n %s\n By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong. \n Here is the revised history:\n %s\nSource: %s",
                super.getDesciption(), this.revisedDescription, this.citation);
    }
    
}
// ====================================================
// REVISED HISTORICAL EVENT EXAMPLE:
// ====================================================
// The following  "history" was told for many years:

// A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.


// By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong. 
// Here is the revised history:
// It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.

// Source: https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/

// ====================================================
// REVISED HISTORICAL EVENT EXAMPLE:
// ====================================================
// The following  "history" was told for many years:

//  Christopher Columbus discovered America in 1492. He was a brave man who sailed across the world and the first man to find America. When the Europeans arrived, they spread their religion and helped civilize the native population.
//  By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong. 
//  Here is the revised history:
//  Columbus was not the first person to discover America. There were natives already living on the land, and Vikings actually sailed to the Americas before Columbus did. When the Europeans arrived they ended up killing large amounts of natives, and they created the highly oppressive mission system to spread their religion.
// Source: https://www.britannica.com/story/did-the-vikings-discover-america