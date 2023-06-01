import request from '@/utils/request'

// 查询分配记录列表
export function listAssignRecord(query) {
  return request({
    url: '/crm/assignRecord/list',
    method: 'get',
    params: query
  })
}

// 查询分配记录详细
export function getAssignRecord(id) {
  return request({
    url: '/crm/assignRecord/' + id,
    method: 'get'
  })
}

// 新增分配记录
export function addAssignRecord(data) {
  return request({
    url: '/crm/assignRecord',
    method: 'post',
    data: data
  })
}

// 修改分配记录
export function updateAssignRecord(data) {
  return request({
    url: '/crm/assignRecord',
    method: 'put',
    data: data
  })
}

// 删除分配记录
export function delAssignRecord(id) {
  return request({
    url: '/crm/assignRecord/' + id,
    method: 'delete'
  })
}
