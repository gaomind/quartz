package com.ptteng.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class MybatisDemo implements Serializable {
    private Integer id;

    private String mName;

    private Integer mAge;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MybatisDemo other = (MybatisDemo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getmName() == null ? other.getmName() == null : this.getmName().equals(other.getmName()))
            && (this.getmAge() == null ? other.getmAge() == null : this.getmAge().equals(other.getmAge()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getmName() == null) ? 0 : getmName().hashCode());
        result = prime * result + ((getmAge() == null) ? 0 : getmAge().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mName=").append(mName);
        sb.append(", mAge=").append(mAge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}