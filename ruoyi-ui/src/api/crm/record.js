import request from '@/utils/request'

// 查询线索分配记录列表
export function listRecord(query) {
  return request({
    url: '/crm/record/list',
    method: 'get',
    params: query
  })
}

// 查询线索分配记录详细
export function getRecord(id) {
  return request({
    url: '/crm/record/' + id,
    method: 'get'
  })
}

// 新增线索分配记录
export function addRecord(data) {
  return request({
    url: '/crm/record',
    method: 'post',
    data: data
  })
}

// 修改线索分配记录
export function updateRecord(data) {
  return request({
    url: '/crm/record',
    method: 'put',
    data: data
  })
}

// 删除线索分配记录
export function delRecord(id) {
  return request({
    url: '/crm/record/' + id,
    method: 'delete'
  })
}
