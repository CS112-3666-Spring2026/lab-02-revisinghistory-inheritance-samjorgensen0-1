public class HistoricalEvent {
    public static final String DEFAULT_DESCRIPTION = "description";
    public static final Date DEFAULT_DAY = new Date(5, 30, 2007);
    private String description;
    private Date day;

    public HistoricalEvent() {
        this.description = DEFAULT_DESCRIPTION;
        this.day = DEFAULT_DAY;
    }

    public HistoricalEvent(String _description, Date _day) {
        this.description = _description;
        this.day = _day;
    }
    public String toString(){
        return String.format("Description: %s\nDate: %s",this.description,this.day.toString());
    }

    public void setDescription(String _description) {
        this.description = _description;
    }
    public void setDay(Date _day) {
        this.day = _day;
    }

    public String getDesciption() {
        return (this.description);
    }
    public Date getDay() {
        return (this.day);
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
        HistoricalEvent otherHistoricalEvent = (HistoricalEvent) other;
        return this.description.equals(otherHistoricalEvent.description)
            && this.day == otherHistoricalEvent.day;
    }
}