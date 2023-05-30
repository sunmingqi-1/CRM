import request from '@/utils/request'

// 查询商机列表
export function listBusiness(query) {
  return request({
    url: '/crm/business/list',
    method: 'get',
    params: query
  })
}

// 查询商机详细
export function getBusiness(id) {
  return request({
    url: '/crm/business/' + id,
    method: 'get'
  })
}

// 新增商机
export function addBusiness(data) {
  return request({
    url: '/crm/business',
    method: 'post',
    data: data
  })
}

// 修改商机
export function updateBusiness(data) {
  return request({
    url: '/crm/business',
    method: 'put',
    data: data
  })
}

// 删除商机
export function delBusiness(id) {
  return request({
    url: '/crm/business/' + id,
    method: 'delete'
  })
}
