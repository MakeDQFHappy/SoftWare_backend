package cn.tongji.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFriendKeyIsNull() {
            addCriterion("friend_key is null");
            return (Criteria) this;
        }

        public Criteria andFriendKeyIsNotNull() {
            addCriterion("friend_key is not null");
            return (Criteria) this;
        }

        public Criteria andFriendKeyEqualTo(Long value) {
            addCriterion("friend_key =", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyNotEqualTo(Long value) {
            addCriterion("friend_key <>", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyGreaterThan(Long value) {
            addCriterion("friend_key >", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyGreaterThanOrEqualTo(Long value) {
            addCriterion("friend_key >=", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyLessThan(Long value) {
            addCriterion("friend_key <", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyLessThanOrEqualTo(Long value) {
            addCriterion("friend_key <=", value, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyIn(List<Long> values) {
            addCriterion("friend_key in", values, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyNotIn(List<Long> values) {
            addCriterion("friend_key not in", values, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyBetween(Long value1, Long value2) {
            addCriterion("friend_key between", value1, value2, "friendKey");
            return (Criteria) this;
        }

        public Criteria andFriendKeyNotBetween(Long value1, Long value2) {
            addCriterion("friend_key not between", value1, value2, "friendKey");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFriendIdIsNull() {
            addCriterion("friend_id is null");
            return (Criteria) this;
        }

        public Criteria andFriendIdIsNotNull() {
            addCriterion("friend_id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendIdEqualTo(Long value) {
            addCriterion("friend_id =", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotEqualTo(Long value) {
            addCriterion("friend_id <>", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThan(Long value) {
            addCriterion("friend_id >", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("friend_id >=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThan(Long value) {
            addCriterion("friend_id <", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThanOrEqualTo(Long value) {
            addCriterion("friend_id <=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdIn(List<Long> values) {
            addCriterion("friend_id in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotIn(List<Long> values) {
            addCriterion("friend_id not in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdBetween(Long value1, Long value2) {
            addCriterion("friend_id between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotBetween(Long value1, Long value2) {
            addCriterion("friend_id not between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeIsNull() {
            addCriterion("last_chat_time is null");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeIsNotNull() {
            addCriterion("last_chat_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeEqualTo(Date value) {
            addCriterion("last_chat_time =", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeNotEqualTo(Date value) {
            addCriterion("last_chat_time <>", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeGreaterThan(Date value) {
            addCriterion("last_chat_time >", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_chat_time >=", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeLessThan(Date value) {
            addCriterion("last_chat_time <", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_chat_time <=", value, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeIn(List<Date> values) {
            addCriterion("last_chat_time in", values, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeNotIn(List<Date> values) {
            addCriterion("last_chat_time not in", values, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeBetween(Date value1, Date value2) {
            addCriterion("last_chat_time between", value1, value2, "lastChatTime");
            return (Criteria) this;
        }

        public Criteria andLastChatTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_chat_time not between", value1, value2, "lastChatTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}