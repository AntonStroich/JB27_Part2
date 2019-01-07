package by.cdp.jb27.antonstroich.lesson9;

public class Edition {
	private int id;
	private String name;
	private int yearPublished;
	
	public Edition(int id, String name, int yearPublished) {
		this.id =id;
		this.name = name;
		this.yearPublished= yearPublished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edition other = (Edition) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Edition [id=" + id + ", name=" + name + ", yearPublished=" + yearPublished + "]";
	}
	
}
